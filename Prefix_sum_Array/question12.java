package Prefix_sum_Array;

public class question12 {
    public static int max_score(String str){
        int ones = 0;
        for(char c : str.toCharArray()){
            if (c == '1') {
                ones++;
            }
        }
        int zeroes = 0;
        int max_score = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == '0') {
                zeroes++;
            }
            else{
                ones--;
            }
            max_score = Math.max(max_score, ones + zeroes);
        }
        return max_score;
    }
    public static void main(String[] args) {
        String str = "011101";
        System.out.println(max_score(str));
    }
}
