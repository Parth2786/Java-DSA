package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        int stair = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stair; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (i % 2 == 0) {
                stair += 2;  
            }
        }
    }
}
