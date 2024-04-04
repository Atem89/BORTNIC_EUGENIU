package homework_nr_4;

public class Circle {
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        circle1.calculateArea();
    }

    public void calculateArea () {
        double area = 3.14 * radius * radius;
        System.out.println("Area of a circle " + area);
    }


}
