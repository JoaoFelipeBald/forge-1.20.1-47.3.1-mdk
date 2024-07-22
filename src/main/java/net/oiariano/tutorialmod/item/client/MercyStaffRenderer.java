package net.oiariano.tutorialmod.item.client;

import net.oiariano.tutorialmod.item.custom.MercyStaff;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MercyStaffRenderer extends GeoItemRenderer<MercyStaff> {
    public MercyStaffRenderer() {
        super(new MercyStaffModel());
    }
}
