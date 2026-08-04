package HackerRank;
import java.util.*;

public class dynamic_array {
    public static List<Integer> dynamicArray(int n , List<List<Integer>> queries){
        List<List<Integer>> seqlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqlist.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        List<Integer> answer = new ArrayList<>();
        for (List<Integer> q : queries) {
            int type = q.get(0);
            int x = q.get(1);
            int y = q.get(2);

            int idx = (x ^ lastAnswer) % n;
            if (type == 1) {
                seqlist.get(idx).add(y);
            }
            else if (type == 2) {
                int size = seqlist.get(idx).size();
                lastAnswer = seqlist.get(idx).get(y % size);
                answer.add(lastAnswer);
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        int n = 2;
        List<List<Integer>> queries = Arrays.asList(
            Arrays.asList(1, 0, 5),  // append 5
            Arrays.asList(1, 1, 7),  // append 7
            Arrays.asList(1, 0, 3),  // append 3
            Arrays.asList(2, 1, 0),  // query -> lastAnswer = 7
            Arrays.asList(2, 1, 1)   // query -> lastAnswer = 3
        );
        List<Integer> result = dynamicArray(n, queries);
        System.out.println(result);
    }
}
