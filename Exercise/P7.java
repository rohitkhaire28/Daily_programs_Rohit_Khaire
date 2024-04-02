import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int[] arrOne = new int[5];
      int[] arrTwo = new int[5];
      int i, j;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter 5 elements for the first array: ");
      for(i=0; i<5; i++)
         arrOne[i] = s.nextInt();
      System.out.print("\nEnter 5 elements for the second array: ");
      for(i=0; i<5; i++)
         arrTwo[i] = s.nextInt();
      
      System.out.println("\nCommon elements are:");
      for(i=0; i<5; i++)
      {
         for(j=0; j<5; j++)
         {
            if(arrOne[i]==arrTwo[j])
               System.out.print(arrOne[i]+ " ");
         }
      }
   }
}