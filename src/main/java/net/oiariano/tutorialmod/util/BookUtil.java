package net.oiariano.tutorialmod.util;
//
//import com.google.common.collect.Lists;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.nbt.ListTag;
//import net.minecraft.nbt.StringTag;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//
//import java.util.List;
//
//public class BookUtil {
//    public static ItemStack createBook(String author, String title, List<String> pages) {
//        ItemStack book = new ItemStack(Items.WRITTEN_BOOK);
//        CompoundTag bookTag = new CompoundTag();
//        bookTag.putString("author", author);
//        bookTag.putString("title", title);
//        book.setTag(bookTag);
//
//        ListTag bookPages = new ListTag();
//        pages.stream()
//                .map(page -> Component.Serializer.toJson(Component.literal(page)))
//                .map(StringTag::valueOf)
//                .forEach(bookPages::add);
//
//        book.addTagElement("pages", bookPages);
//        return book;
//    }
//    public static final List<String> REGISTRY_OUT_PAGES = Lists.newArrayList(
//            "Um forasteiro? Que surpresa... agradável?\n\n" +
//                    "Seja bem-vindo ao nosso mundo, fazem alguns anos que o Sol sumiu, foi substitúido por aquele símbolo no céu, ou foram décadas? Não lembro mais.\n\n" +
//                    "E os monstros?",
//            "São os moradores locais, apenas Um pouco indisciplinados.\n\n" +
//                    "Acho que costumavam fugir do Sol, não que isso importe mais, então espero que você não seja do tipo que precisa de silêncio para dormir.\n\n" +
//                    "Mas não se desespere, todos nós aqui compartilhamos do mesmo azar.",
//            "você está tão preso aqui quanto eu.\n\n" +
//                    "Respire fundo e boa sorte, estamos em falta disso aqui.",
//            "Não posso sair desse lugar, mas outro visitante disse que há uma vila nessas coordenadas -x -y -z, se encontrar alguma relíquia" +
//                    " eu posso considerar comprar, espero que você não tenha problema com cavar covas."
//    );
//}