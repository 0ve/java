import java.util.Scanner;

public class HiLo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Välkommen till HiLo!");
      System.out.println("Vilken svårighetsgrad?");
      System.out.println("0. Lätt (1-10)");
      System.out.println("1. Mellan (1-100)");
      System.out.println("2. Svårt 1-1000)");

      int niva = sc.nextInt();
      int maxNumber = 1;
      
      if (niva == 0) {
         maxNumber = 10;
         System.out.println("Gissa på ett tal mellan 1-10");
      }
      else if (niva == 1) {
         maxNumber = 100;
         System.out.println("Gissa på ett tal mellan 1-100");
      }
      else if (niva == 2) {
         maxNumber = 1000;
         System.out.println("Gissa på ett tal mellan 1-1000");
      }
      
      System.out.println(playGame(maxNumber));
   }
   
   public static int playGame(int maxNumber) {
      Scanner sc = new Scanner(System.in);
      
      int answer = (int)(Math.random() * maxNumber) +1;
      int guess;
      int gissningar = 0;
      
      while(true) {
         guess = sc.nextInt();
         gissningar++;
         giveResponse(guess, answer, maxNumber, gissningar);
         
         if (guess == answer) {
            break;
         }
      }
      return gissningar;
   }
   
   public static void giveResponse(int guess, int answer, int maxNumber, int gissningar) {
      if (guess < answer) {
         System.out.println("Gissningen var för låg!");
         System.out.println("Gissa på ett tal mellan 1 och " + maxNumber);
      }
      else if (guess > answer) {
         System.out.println("Gissningen var för hög!");
         System.out.println("Gissa på ett tal mellan 1 och " + maxNumber);
      }
      else if (guess == answer) {
         System.out.println("Helt rätt!");
         System.out.println("Du lyckades på " + gissningar + " försök!");
      }
   }
}