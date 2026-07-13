package Maths;

public class question2 {
    public static boolean uglyNumber(int num){

        // Not submitted on leetcode.
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3; 
        while (num % 5 == 0) num /= 5;

        return num == 1;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(uglyNumber(num));
    }
}
