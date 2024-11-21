import java.until.Scanner;

puplic class IT24104291Lab4Q1  {
     public static void main(String[] args) {
   Scanner scanner = new Scannner (System.in);

   System.out.print("Enter a number: ");
   int number = scanner.nextInt ();

   if (number > 0)  {
       System.out.println("The number is: Positive");
   } else if  (number < 0)    {
       System.out.println("The number is: Negative");
   } else {
       System.out.println("The number is: Zero");
    }

   scannner.close();
     }
   }  