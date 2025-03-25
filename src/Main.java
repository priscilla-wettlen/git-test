import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello please enter your name!");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.equals("Joel")) {
            Joel joel = new Joel();
            joel.hello();
            joel.food();
        }
        if(name.equals("Priscilla")) {
            priscilla priscilla = new priscilla();
            priscilla.hello();
        }
        sc.close();
        System.out.println("Goodbye!");
    }
}
