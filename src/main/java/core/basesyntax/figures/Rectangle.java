package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class Rectangle extends Figure {
    public int firstSide;
    public int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public float getArea() {
        return (float) firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() +
                "sq. units, first side: " + firstSide + " units, second side: " +
                secondSide + " units, color: " + color.getValue());
    }
}


