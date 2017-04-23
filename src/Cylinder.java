

public class Cylinder {

        private  double mRadius;
        private double mLength;

    public Cylinder(double radius, double rength) {
        mRadius = radius;
        mLength = rength;

    }
   public double getVolume( ) {
       final double PI = 3.14;
       double area = Math.pow(mRadius,2) * PI;
       double volume = area * mLength;
       return volume;

   }




}
