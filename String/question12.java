package String;

import java.util.Scanner;

public class question12 {
    public static int countCorrect(String adrian, String bruno, String goran, String ans, int n){
        int ascore = 0;
        int bscore = 0;
        int gscore = 0;
        for (int i = 0; i < n; i++) {
            char correct = ans.charAt(i);
            if (correct == adrian.charAt(i % adrian.length())) {
                ascore++;
            }
            if (correct == bruno.charAt(i % bruno.length())) {
                bscore++;
            }
            if (correct == goran.charAt(i % goran.length())) {
                gscore++;
            }
        }
        int maxscore = Math.max(ascore, Math.max(bscore, gscore));
        if (maxscore == ascore) {
            System.out.println("Adrian");
        }
        if (maxscore == bscore) {
            System.out.println("Bruno");
        }
        if (maxscore == gscore) {
            System.out.println("Goran");
        }
        return maxscore;
    }
    public static void main(String[] args) {
        String adrian = "ABC";
        String bruno = "BABC";
        String goran = "CCAABB";
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        int n = sc.nextInt();
        System.out.println(countCorrect(adrian,bruno,goran,ans,n));
        
    }
}
