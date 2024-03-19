import java.awt.Point;
class MySimpleRectangle{
    private Point topLeft;
    private int width, height;
    public MySimpleRectangle(){this.topLeft = new Point(0,0); this.width = 1; this.height = 2;}
    public MySimpleRectangle(int x, int y, int width, int height){this.topLeft = new Point(x,y); this.width = width; this.height = height;}
    public MySimpleRectangle(Point topLeft){this.topLeft = topLeft; this.width = 1; this.height = 2;}
    public Point getTopLeft(){return this.topLeft;}
    public int getWidth(){return this.width;}
    public int getHeight(){return this.height;}
    public int getPerimeter(){return (this.width * 2) + (this.height * 2);}
    public int getArea(){return this.width * this.height;}
    public String toString(){return String.format("%s, area=%d", getClass().getName(), getArea());}
    public static void main(String[] args) {
        MySimpleRectangle r = new MySimpleRectangle();
        System.out.println(r);
        System.out.println(r.getTopLeft());
        MySimpleRectangle r1 = new MySimpleRectangle(10, 20, 30, 40);
        System.out.println(r1);
        System.out.printf("width=%d, height=%d, area=%d\n", r1.getWidth(), r1.getHeight(),r1.getPerimeter());
        MySimpleRectangle r2 = new MySimpleRectangle(new Point(10, 20));
        System.out.println(r2);
        System.out.printf("width=%d, height=%d, area=%d\n", r1.getWidth(), r1.getHeight(),r1.getPerimeter());
        /* EXPECTED:
         * MySimpleRectangle, area=2
         * java.awt.Point[x=0,y=0]
         * MySimpleRectangle, area=1200
         * width=30, height=40, area=140
         * MySimpleRectangle, area=2
         * width=30, height=40, area=140
         */     	
        MySimpleRectangle r3 = new MySimpleRectangle (new Point(18, 26));
        System.out.println(r3.getPerimeter());
        /* EXPECTED:
         * 6
         */
    }
}