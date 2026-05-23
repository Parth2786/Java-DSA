package Functions;

public class question1 {
    int a = 10;
    int b = 20;
    void add(int a){
        System.out.println(a); //Overshadowing of the function calling.
        System.out.println(this.a); 
    }
    public void main(String[] args) {
        add(6);
    }
}
