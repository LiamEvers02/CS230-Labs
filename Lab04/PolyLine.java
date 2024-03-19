import java.awt.Point;
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
       
}