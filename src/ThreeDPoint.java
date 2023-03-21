public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof ThreeDPoint)){
            return false;
        }
        //

        ThreeDPoint point2 = (ThreeDPoint) obj;
        return super.equals(point2) && this.z == point2.z;
    }
}
