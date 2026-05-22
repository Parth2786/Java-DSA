package Loops;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int Armstrong = 0;
        while (n < 0) {
            int temp = n % 10;
            Armstrong += (temp * temp * temp);
            n /= 10;
        }
        if (Armstrong == original) {
            System.out.println("The number is an Armstrong Number");
        }
        else{
            System.out.println("The number is not an Armstrong Number.");
        }
    }
}
