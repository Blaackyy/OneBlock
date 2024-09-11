package lynk.oneblock.utils;

import net.minecraft.text.*;
import net.minecraft.util.Formatting;

public class PrettyMessages {
    public static Text prettyError(String message) {
        Style defaultStyle = Style.EMPTY.withColor(Formatting.RED);
        return MutableText.of(PlainTextContent.of(message)).setStyle(defaultStyle);
    }
}
