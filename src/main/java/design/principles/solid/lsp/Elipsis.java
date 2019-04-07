package design.principles.solid.lsp;

public class Elipsis extends Shape {
    Elipsis(Integer length) {
        super(length, length);
    }

    @Override
    public void setLength(Integer length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(Integer width) {
        super.setWidth(width);
    }

    // getArea() is not overriden making the child not substituable for parent
}
