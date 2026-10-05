package Two_Pointers;
import java.util.*;;
public class question16 {

    // This is the leetcode question number 881 in which we have to return the maximum number of boats to carry every person based on the limit of the boat.
    public static int boat_count(int[] people, int limit){
        Arrays.sort(people);
        int n = people.length;
        int left = 0;
        int right = n - 1;
        int boats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            else{
                right--;
            }
            boats++;
        }
        return boats;
    }

    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(boat_count(people, limit));
    }
}
