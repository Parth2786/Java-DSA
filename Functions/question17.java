package Functions;

public class question17 {
    public static int Binary_Decimal(int n){
        int result = 0;
        int place = 1;  
        while (n > 0) {
            int digit = n % 10;          
            result = result + digit * place; 
            place *= 2;                  
            n /= 10;                     
        }
        return result;
    }     public static void main(String[] args) {
        int n = 11001;
        System.out.println(Binary_Decimal(n));

    }
}
