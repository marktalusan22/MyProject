import java.util.*;
public class GradeAnalyzer{
	public static void main(String Mark[]){
	Scanner input = new Scanner(System.in);

	char choice;

	do{
           System.out.print("Enter grade: ");
	   int grade = input.nextInt();

	    if(grade >= 95)
		System.out.println("Excellent!");
	    else if(grade >= 90)
		System.out.println("Very Good!");
	    else if(grade >= 75)
		System.out.println("Nice!");
            else
	        System.out.println("Failed!");
	    System.out.println("Do you want to analyze another grade(Y/N)? ");
	    choice = input.next().charAt(0);

	} while(choice == 'Y');
     }
}