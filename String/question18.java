package String;

public class question18 {
    public static String add_string(String num1, String num2){
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "111";
        String num2 = "456";
        System.out.println(add_string(num1,num2));
    }
}
