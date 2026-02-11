public class LoopDemo {
   public static void main(String[] args) {
        
     int i = 0;
     for (i=0; i<=10; i=i+1) 
       System.out.print(i+" ");

     System.out.println();
     i=1;
     while (i<=10) {
       System.out.print(i+" ");
     i+=1;
     }
   
     System.out.println();
     i=1;
     do {
       System.out.print(i+" ");
     ++i;
     } while (i<=10);
      System.out.println();

      for (int x=1; x<=10; ++x) {
       for (int y=1; y<=10; ++y) 
         System.out.print("|"+(x*y)+"|\t");
         System.out.println(); 
       }
      
      System.out.println();
      System.out.println("Right Triangle");
      for (int a=1; a<=5; ++a) {
       for (int b=1; b<=a; ++b)
         System.out.print("*");
         System.out.println();
       }

       System.out.println();
       System.out.println("Inverted Right Triangle");
       for (int a=5; a>=1; --a) {
        for (int b=1; b<=a; ++b) 
          System.out.print("*");
          System.out.println();
        }
  
     }
}