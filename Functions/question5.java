package Functions;

public class question5 {
    public static double f_to_c(int a){
        double celcius = (a - 32) * 5/9;
        return celcius;
    }
    public static void main(String[] args) {
        int c = 32;
        System.out.println(f_to_c(c));
    }
}
