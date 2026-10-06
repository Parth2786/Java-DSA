package Two_Pointers;
import java.util.*;
public class question17 {

    // This is the question number 948 on leetcode in which we have to return the maximum score after using the token and the given power.
    // First sort the given token array.
    // Use two pointer left for buying score with the cheapest token and right for selling the score for expensive token.
    public static int bagOfTokens(int[] token, int power){
        Arrays.sort(token);
        int left = 0;
        int right = token.length - 1;
        int score = 0;
        int maxscore = 0;
        while (left <= right) {
            if (power >= token[left]) {
                power -= token[left];
                score++;
                left++;
                maxscore = Math.max(maxscore, score);
            }
            else if(score > 0){
                power -= token[right];
                score--;
                right--;
            }
            else{
                break;
            }
        }
        return maxscore;
    }


    public static void main(String[] args) {
        int[] token = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokens(token, power));
    }
}
