package Maths;

public class question5 {
    public static int position(int n){
        int pos = 1;
        while (pos * 2 <= n) {
            pos *= 2;
        }
        return pos;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(position(n));
    }
}
