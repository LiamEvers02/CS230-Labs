class MySimpleCuboid{
    private MySimpleRectangle base;
    private int length;
    public MySimpleCuboid(){this.base = new MySimpleRectangle(); this.length = 1;}
    public MySimpleCuboid(int x, int y, int width, int height, int length){this.base = new MySimpleRectangle(x, y, width, height); this.length = length;}
    public MySimpleCuboid(int length){this.base = new MySimpleRectangle(); this.length = length;}
    public int getVolume(){return base.getArea() * length;}
    public String toString(){return String.format("%s, volume=%d", getClass().getName(), getVolume());}

    public static void main(String[] args){
        MySimpleCuboid r = new MySimpleCuboid();
        System.out.println(r);
        MySimpleCuboid r1 = new MySimpleCuboid(25);
        System.out.println(r1);
        MySimpleCuboid r2 = new MySimpleCuboid(25, 32, 36, 12, 25);
        System.out.println(r2);
        /* EXPECTED:
         * MySimpleCuboid, volume=2
         * MySimpleCuboid, volume=50
         * MySimpleCuboid, volume=10800
         */
    }
}