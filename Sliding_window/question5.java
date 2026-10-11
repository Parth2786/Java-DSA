package Sliding_window;

public class question5 {

    // This is the leetcode question number 1423 in which we have to find the maximum score you can score after picking the k cards from the beginning of the array or end of the array.
    public static int max_score(int[] cards, int k){
        int n = cards.length;
        int total = 0;
        for (int num : cards) {
            total += num;
        }
        int windowsize = n - k;
        int windowsum = 0;
        for (int i = 0; i < windowsize; i++) {
            windowsum += cards[i];
        }
        int minsum = windowsum;
        for (int i = windowsize; i < n; i++) {
            windowsum += cards[i] - cards[i - windowsize];
            minsum = Math.min(minsum, windowsum);
        }
        return total - minsum;
    }

    public static void main(String[] args) {
        int[] cards = {9,7,7,9,7,7,9};
        int k = 7;
        System.out.println(max_score(cards, k));
    }
}
