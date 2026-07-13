package String;

public class question10 {
    public static char countFreq(String str){
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char)(i + 'a');
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String str = "output";
        System.out.println(countFreq(str));
    }
}
