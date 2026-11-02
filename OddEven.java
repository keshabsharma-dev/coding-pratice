import java.util.Scanner;
public class OddEven {
    public static void checkNum(int n ){
        if(n%2!=0) System.out.println("Odd Number");
        else System.out.println("Even Number");
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        checkNum(num);
        scan.close();
    }
}

