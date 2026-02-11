import java.util.*;
public class ScoreAnalysis {
  public static void main(String [] Mark) {
    Scanner input = new Scanner(System.in);
   
    int [] scores = {85, 70, 90, 65, 88, 92, 74, 81, 60, 77};
    
    int passed = 0;
    int failed = 0;
   
    System.out.println("Exam Scores: ");
    for (int i = 0; i < scores.length; i++) {
       System.out.print(scores[i] + " ");
    }
  
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] >= 75) {
          passed++;
      } else {
          failed++;
      }
  } 
   
     System.out.print("\n\nPassed: " + passed);
     System.out.println();
     System.out.print("Failed: " + failed);
    
     }
}