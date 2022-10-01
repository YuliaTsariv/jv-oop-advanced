package core.basesyntax.figures;

import core.basesyntax.FiguresClass;

public class Square extends FiguresClass {
    private int side;

    public Square(int side,String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:"
                + areaCalculator()
                + " sq.units, side: " + this.side
                + " units, color: " + this.getColor());
    }
}
