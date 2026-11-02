import java.util.Scanner;

public class Divisibility {
    public static void checkDiv(int n ){
        if(n%3==0 && n%5==0) System.out.println("Divisible");
        else System.out.println("Not Divisible");
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int val = scan.nextInt();
        checkDiv(val);

    }
}
