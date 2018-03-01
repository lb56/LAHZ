import java.util.*;

public class Game {
   public static void main(String [] args) {
   
   // lav dyr
   Animal snake = new Animal("Snake");
   Animal rabbit = new Animal("Rabbit");
   
   int count = 0;
   
  // console input
   Scanner console = new Scanner(System.in);
   
   System.out.println("Welcome to the game \"Bunny Hop\".");
   System.out.println("Let us see how many turns you are able to stay away and not be eaten by the snake.");  
   System.out.println("Type \'hop\' to start the game.");
   while (!console.hasNext("hop")) {
      System.out.println("You have made a typo. Try again.");
      console.next(); 
   }
   
   
   snake.move();
   
   System.out.println();
   System.out.println("***********GAME OVER*************");
   System.out.println("The Rabbit was eaten by the Snake.");
   System.out.println("You survived for " + count + " rounds.");
  

   }
   
}