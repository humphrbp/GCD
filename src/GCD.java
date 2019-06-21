
import java.util.Scanner;


public class GCD {


       public static void main(String[] args) {

 

              Scanner values = new Scanner(System.in);

      

                     System.out.println("First Value: ");

                     int value1 = values.nextInt();

                     System.out.println("Second Value: ");

                     int value2 = values.nextInt();

                     values.close();


              System.out.println("Greatest Common Denominator is " + getGCD(value1, value2));

       }


       private static int getGCD(int value1, int value2) {

              if (value2 == 0) {

                     return value1;
              }

              return getGCD(value2, value1%value2);

       }

 

}