
// static method
//import java.util.Scanner;
//
//public class SumofDigit {
//    public static int sumDigit(int n ){
//        int sum =0;
//        while(n>0){
//            sum+= n%10;
//            n/=10;
//        }
//        return sum;
//    }
//
//   public static void main() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the digit: ");
//        int digit = scan.nextInt();
//        int sum = sumDigit(digit);
//        System.out.println("Sum of digit: "+sum);
//        scan.close();
//    }
//}

// trying using non-static
import java.util.Scanner;

public class SumofDigit {
    public int sumDigit(int n ){
        int sum =0;
        while(n>0){
            sum+= n%10;
            n/=10;
        }
        return sum;
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit = scan.nextInt();
        SumofDigit obj = new SumofDigit();
        int sum = obj.sumDigit(digit);
        System.out.println("Sum of digit: "+sum);
        scan.close();
    }
}

