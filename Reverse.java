import java.util.Scanner;

public class Reverse {
    public  int reverseNum(int n ){
        int rev = 0;
        while(n>0){
            rev*=10;
            rev+=(n%10);
            n/=10;
        }
        return rev;
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        Reverse obj = new Reverse();
        System.out.println("Enter the digit to reverse: ");
        int digit = scan.nextInt();
        System.out.println("Reverse of Digit : "+obj.reverseNum(digit));
    }
}
