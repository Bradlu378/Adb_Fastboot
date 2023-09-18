package modules;
// cреднее время выполнения всех методов за раз: 6,875ms
import java.io.File;

public class AccentColor {
    final static File ff = new File(AccentColor.class.getResource("/libs/native.dll").getFile());
    private String hexValue;

    private AccentColor() {
        this.hexValue = Integer.toHexString(getAccentColor()).substring(2);
    }

    static native int getAccentColor();

    public static AccentColor getHex() {
        System.load(String.valueOf(ff));
        return new AccentColor();
    }

    public AccentColor dark() {
        int r = Integer.parseInt(hexValue.substring(0, 2), 16);
        int g = Integer.parseInt(hexValue.substring(2, 4), 16);
        int b = Integer.parseInt(hexValue.substring(4, 6), 16);

        r = (int) Math.round(r * (1 - 0.1));
        g = (int) Math.round(g * (1 - 0.1));
        b = (int) Math.round(b * (1 - 0.1));

        // Проверяем и корректируем значения RGB
        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));

        // Создаем новый затемненный цвет в формате HEX
        this.hexValue = String.format("%02x%02x%02x", r, g, b);

        return this;
    }


    public AccentColor darker() {
        int r = Integer.parseInt(hexValue.substring(0, 2), 16);
        int g = Integer.parseInt(hexValue.substring(2, 4), 16);
        int b = Integer.parseInt(hexValue.substring(4, 6), 16);

        r = (int) Math.round(r * (1 - 0.2));
        g = (int) Math.round(g * (1 - 0.2));
        b = (int) Math.round(b * (1 - 0.2));

        r = Math.max(0, Math.min(r, 255));
        g = Math.max(0, Math.min(g, 255));
        b = Math.max(0, Math.min(b, 255));

        this.hexValue = String.format("%02x%02x%02x", r, g, b);
        return this;
    }

    public String get() {
        return "#" + hexValue + "ff";
    }
}