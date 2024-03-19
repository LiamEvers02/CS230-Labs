import java.awt.Point;
import java.util.ArrayList;
class PolyLine{
    private ArrayList<Point> points;
    public PolyLine(){this.points = new ArrayList<>();}
    public void appendPoint(int x, int y){points.add(new Point(x,y));}
    public String toString(){
        if (points.isEmpty()){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Point p : points){
            stringBuilder.append(p.toString()).append(">");
        }
        // Remove the last ">" character
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        PolyLine line1 = new PolyLine(); line1.appendPoint(10, 20);
        PolyLine line2 = new PolyLine(); line2.appendPoint(10, 20);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line1 == line2);
        line1.appendPoint(20, 30);
        System.out.println(line1);
        PolyLine line3 = new PolyLine();
        System.out.println(line3);
        System.out.println("DONE");
        /* EXPECTED:
         * java.awt.Point[x=10,y=20]
         * java.awt.Point[x=10,y=20]
         * false
         * java.awt.Point[x=10,y=20]>java.awt.Point[x=20,y=30]
         *
         * DONE
         * 
         */
        PolyLine line = new PolyLine();
        System.out.println("line:" + line);
        line.appendPoint(1, 2);
        System.out.println(line);
        /* EXPECTED:
         * line:
         * java.awt.Point[x=1,y=2]
         */
        int[] values = {10, 20, 30, 40, 50};
        PolyLine line4 = new PolyLine();
        for (int i: values) line4.appendPoint(i, i+10);
        System.out.println(line4);
        /* EXPECTED:
         * java.awt.Point[x=10,y=20]>java.awt.Point[x=20,y=30]>java.awt.Point[x=30,y=40]>java.awt.Point[x=40,y=50]>java.awt.Point[x=50,y=60]
         */
    }
       
}