package core.basesyntax.figures;

import core.basesyntax.services.Color;

public class IsoscelesTrapezoid extends Figure {
    public int firstSide;
    public int secondSide;
    public int height;

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (float) (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + "sq. units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, height: "
                + height + " units, color: " + color.getValue());
    }
}
