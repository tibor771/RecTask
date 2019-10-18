package sk.itsovy.sestak.projectFragment;

public class Circle {
    private int radius;

    public class Circle1 {
        private int radius;

        public Circle1(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public double calcArea(){
            return Math.PI*radius*radius;
        }
        public double calcPerimeter(){
            return 2*Math.PI*radius;
        }
}
}
