import java.util.Scanner;
public class LeapYear {
      public static void checkLeap(int n ){
          if((n%400==0) || (n%4==0 && n%100!=0)){
              System.out.println("Leap Year");
          }
          else{
              System.out.println("Not a Leap year");
          }
      }

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scan.nextInt();
        checkLeap(year);
        scan.close();
    }
}
