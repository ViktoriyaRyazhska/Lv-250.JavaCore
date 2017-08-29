/**
 * Created by User on 14.07.2017.
 */
public class main4 {
    public class Circle{

        private double r;



        public Circle(double r) {
            this.r = r;
        }
        public double circle_length(double r){
            return 2*Math.PI*r;
        }

    }

    public class Cylinder extends Circle  {

        private double height;

        public Cylinder(double r, double height) {
            super(r);
            this.height = height;
        }

        @Override
        public double circle_length(double r) {
            return super.circle_length(r);
        }
        public double squere_surface(double r, double h){
            return r*h;
        }
        
    }
}
