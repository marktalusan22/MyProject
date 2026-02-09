import java.util.Scanner;
public class MathDemo {
    public static void main(String Mark[] ) {
        Scanner input = new Scanner(System.in);
        int N1, N2, ans;
        N1 = 90;
        N2 = 85;
        
        ans = N1+N2;
        System.out.println("Sum =" + ans);
        ans = N1-N2;
        System.out.println("Difference =" + ans);
        ans = N1*N2;
        System.out.println("Product =" + ans);
        ans = N1/N2;
        System.out.println("Quotient =" + ans);
        ans = N1%N2;
        System.out.println("Remainder =" + ans);
        
        double grd = 74;
        if (grd > 74.9)
            System.out.println("You Passed!");
        else 
            System.out.println("You Failed!");
        
        System.out.println("Remarks: ");
        if (grd > 95)
            System.out.println("Excellent!");
          else if (grd > 89)
            System.out.println("Good Job!");
          else if (grd > 75)
            System.out.println("Very Good!");
          else
            System.out.println("Better Luck nextime!");
            System.out.println();
            
        System.out.print("Enter Day of Week(1-7): ");
        int day = input.nextInt();
          switch(day) {
              case 1: System.out.print("Monday");    break;
              case 2: System.out.print("Tuesday");   break;
              case 3: System.out.print("Wednesday"); break;
              case 4: System.out.print("Thursday");  break;
              case 5: System.out.print("Friday");    break;
              case 6: System.out.print("Saturday");  break;
              case 7: System.out.print("Sunday");    break;
          }            
    } 
}
