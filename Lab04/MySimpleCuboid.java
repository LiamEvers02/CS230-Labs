class MySimpleCuboid{
    private MySimpleRectangle base;
    private int length;
    public MySimpleCuboid(){this.base = new MySimpleRectangle(); this.length = 1;}
    public MySimpleCuboid(int x, int y, int width, int height, int length){this.base = new MySimpleRectangle(x, y, width, height); this.length = length;}
    public MySimpleCuboid(int length){this.base = new MySimpleRectangle(); this.length = length;}
    public int getVolume(){return base.getArea() * length;}
    public String toString(){return String.format("%s, volume=%d", getClass().getName(), getVolume());}
}