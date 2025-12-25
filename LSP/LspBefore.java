package ict301.solid.lsp;

class Rectangle {
    protected int width, height;
    public void setWidth(int w) { this.width = w; }
    public void setHeight(int h) { this.height = h; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setHeight(w);
    }
    @Override
    public void setHeight(int h) {
        super.setWidth(h);
        super.setHeight(h);
    }
}
