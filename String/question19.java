package String;

public class question19 {
    public static String add(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        int count = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            ans.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String num1 = "1010100";
        String num2 = "0100101";
        System.out.println(add(num1, num2));
    }

}