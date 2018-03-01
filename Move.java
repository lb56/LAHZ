import java.util.*;

public class Move {   
   
   // attributter
   private String name;
   private String move;
   
   int count = 0;
   
   // random objekt
   Random r = new Random();
   
   public name(name){
   this.name = name; 
   }   
   public Move(String move) {
      this.name = move;
      }
   
   public void setMove(String name) {
      name = name;
   
   }
   
   public void move() {
      int x1 = 1;
      int y1 = 1;
      int x2 = 9;
      int y2 = 9;
      int count = 0;
      
      while (! ((x1 == x2) && (y1 == y2))) {
      count++;
      if (r.nextInt(2)+1 == 1) {
      x1 = x1+1;
      }
      else {
      x1 = x1-1; 
      }   
      
      if (r.nextInt(2)+1 == 1) {
      x2 = x2+1;
      }
      else {
      x2 = x2-1;
      }            
      
      if (r.nextInt(2)+1 == 2) {
      y1 = y1+1;
      }
      else {
      y1 = y1-1;
      }
      
      if (r.nextInt(2)+1 == 2) {
      y2 = y2+1;
      }
      else {
      y2 = y2-1;
      }
      
      // begr�nsning af f�rste kvadrant
      if (x1 == 10) {
      x1 = x1 - 2;
      }
      if(x1 == 0) {
      x1 = x1 + 2;
      }
      if (x2 == 10) {
      x2 = x2 - 2;
      }
      if (x2 == 0) {
      x2 = x2 + 2;
      }
      if (y1 == 10) {
      y1 = y1 - 2;
      }  
      if (y1 == 0) {
      y1 = y1 + 2;
      }  
      if (y2 == 10) {
      y2 = y2 - 2;
      }
      if (y2 == 0) {
      y2 = y2 + 2;
      }   
      
      // st�r et ryk fra hinanden
      double a = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
      double b = Math.sqrt(a);
      double c = Math.sqrt(2);
      
      if (b <= c) {
         System.out.println("Rabbit: Arrgh! Mr. Snake, please do not eat me!");
      }
      
      // st�r p� samme felt
      if ((x1 == x2) && (y1 == y2)) {
         System.out.println("I am the " + name " and I stand on point (" + x1 + ", " + y1 + ")");
         System.out.println("I am the Snake and I stand on point (" + x2 + ", " + y2 + ")");
         System.out.println("Rabbit: Arrgh! Mr. Snake, please do not eat me!");
         System.out.println("Snake: I am hungry, so I'm going to eat you!");  
      }
      else {
         System.out.println("I am the Rabbit and I stand on point (" + x1 + ", " + y1 + ")");     
         System.out.println("I am the Snake and I stand on point (" + x2 + ", " + y2 + ")");
      }     
      } 
   }
}