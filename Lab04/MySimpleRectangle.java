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
}