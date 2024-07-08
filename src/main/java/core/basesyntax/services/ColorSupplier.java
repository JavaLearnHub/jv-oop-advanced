package core.basesyntax.services;

import java.util.Random;

public class ColorSupplier {

    public Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();

        return colors[random.nextInt(colors.length)];
    }
}
