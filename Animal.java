import java.util.*;

public class Animal {
  
  // lav pseudorandom objekt
  Random r = new Random();
   
  // attributter
  private String name;
  private String location;
  
  private int x1;
  private int y1;
  private int x2;
  private int y2;  
  
  // constructor med navneparameter
  public Animal(String name) {
   this.name = name;
  }
  
  
  
  public void setName(String animal) {
   name = animal;   
  }

}