package Maths;

public class qustion3 {
    public static int collect_fine(int[] car, int[] fine, int date){
        int total_fine = 0;
        for (int i = 0; i < car.length; i++) {
            if (date % 2 == 0 && car[i] % 2 != 0) {
                total_fine += fine[i];
            }
            else if (date % 2 != 0 && car[i] % 2 == 0) {
                total_fine += fine[i];
            }
        }
        return total_fine;
    }
    public static void main(String[] args) {
        int[] car = {2,3,4,5};
        int[] fine = {500,300,200,150};
        int date = 12;
        System.out.println(collect_fine(car, fine, date));
    }
}
