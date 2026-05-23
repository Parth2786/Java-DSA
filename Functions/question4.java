package Functions;

public class question4 {
    public static double area_circle(double radius){
        double pi = 3.14;
        double area = pi * (radius * radius);
        return area;
    }
    public static void main(String[] args) {
        double radius = 3.451;
        System.out.println(area_circle(radius));
    }
}
