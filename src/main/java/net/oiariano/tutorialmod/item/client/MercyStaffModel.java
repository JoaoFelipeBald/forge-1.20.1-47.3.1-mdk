package net.oiariano.tutorialmod.item.client;

import net.minecraft.resources.ResourceLocation;
import net.oiariano.tutorialmod.TutorialMod;
import net.oiariano.tutorialmod.item.custom.MercyStaff;
import software.bernie.geckolib.model.GeoModel;

public class MercyStaffModel extends GeoModel<MercyStaff> {
    @Override
    public ResourceLocation getModelResource(MercyStaff animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/mercy_staff.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MercyStaff animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/item/mercy_staff.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MercyStaff animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/mercy_staff.animation.json");
    }
}
