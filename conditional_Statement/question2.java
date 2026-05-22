package conditional_Statement;

import java.util.Scanner;

public class question2 {
    //keep taking the input from the untill you get an odd number from the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 1;
        while (sc.nextInt() % 2 == 0) {
            i++;
            count++;
        }
        System.out.println(count);
    }
}
