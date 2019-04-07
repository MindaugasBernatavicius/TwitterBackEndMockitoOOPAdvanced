package design.principles.solid.lsp;

class Shape {
    private Integer length;
    private Integer width;

    Shape(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    void setLength(Integer length) {
        this.length = length;
    }

    void setWidth(Integer width) {
        this.width = width;
    }

    Integer getArea() {
        return this.length * this.width;
    }


}