package com.company;

public class Leaf {
    private ColorOfLeaf colorOfLeaf;
    private ShapeOfLeaf shape;

    public Leaf(ColorOfLeaf colorOfLeaf, ShapeOfLeaf shape) {
        this.colorOfLeaf = colorOfLeaf;
        this.shape = shape;
    }

    public Leaf() {
    }

    public ColorOfLeaf getColorOfLeaf() {
        return colorOfLeaf;
    }

    public void setColorOfLeaf(ColorOfLeaf colorOfLeaf) {
        this.colorOfLeaf = colorOfLeaf;
    }

    public ShapeOfLeaf getShape() {
        return shape;
    }

    public void setShape(ShapeOfLeaf shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leaf leaf = (Leaf) o;

        if (colorOfLeaf != leaf.colorOfLeaf) return false;
        return shape == leaf.shape;
    }

    @Override
    public int hashCode() {
        int result = colorOfLeaf != null ? colorOfLeaf.hashCode() : 0;
        result = 31 * result + (shape != null ? shape.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "colorOfLeaf=" + colorOfLeaf +
                ", shape=" + shape +
                '}';
    }
}
