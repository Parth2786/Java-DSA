package HackerRank;
import java.lang.reflect.Array;
import java.util.*;
public class question1 {
    public static void countApples_Oranges(List<Integer> apple, List<Integer> orange, int s, int t, int a, int b){
        int apple_count = 0;
        int orange_count = 0;
        for (int dist : apple) {
            int landed = dist + a;
            if (landed >= s && landed <= t) {
                apple_count++;
            }
        }
        for (int dist : orange) {
            int landed = dist + b;
            if (landed >= s && landed <= t) {
                orange_count++;
            }
        }

        System.out.println(apple_count);
        System.out.println(orange_count);
        
    }
    public static void main(String[] args) {
        List<Integer> apple = Arrays.asList(-2,2,1);
        List<Integer> orange = Arrays.asList(5,-6);
        int s = 7, t = 11;    //sam's house length;
        int a = 5, b = 15;    //apple and orange tree located at a and b point respectively.
        countApples_Oranges(apple, orange, s, t, a, b);
    }
}
