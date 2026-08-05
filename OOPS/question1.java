package OOPS;

class question1 {
    private int big;
    private int medium;
    private int small;

    // Constructor name must match the class name
    public question1(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Initialize parking system with 1 big, 1 medium, 0 small slots
        question1 ps = new question1(1, 1, 0);

        System.out.println(ps.addCar(1)); // true → one big car parked
        System.out.println(ps.addCar(2)); // true → one medium car parked
        System.out.println(ps.addCar(3)); // false → no small slot available
        System.out.println(ps.addCar(1)); // false → big slot already used
    }
}
