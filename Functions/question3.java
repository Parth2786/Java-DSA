package Functions;

import java.util.Scanner;

public class question3 {
    public static boolean prime(int a){
        
        if (a <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;  
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
}
