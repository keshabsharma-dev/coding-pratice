import java.util.Scanner;

public class SumofNumber {
    public static int  sumOfNumber(int n ){
        int sum =0;
        for(int i = n; i>0; i--){
              sum+=i;
        }
          return sum;
    }

    static void main() {
        int n = 5;
        System.out.println(sumOfNumber(n));
    }
}
