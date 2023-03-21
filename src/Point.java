public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Point)) {
            return false;
        }

        Point point2 = (Point) (object2);
        return this.x == point2.x && this.y == point2.y;
    }
}
