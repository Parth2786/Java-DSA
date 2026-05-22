package conditional_Statement;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are Eligible for voting");
        }
        else{
            System.out.println("You are not Eligible for voting");
        }
    }
}
