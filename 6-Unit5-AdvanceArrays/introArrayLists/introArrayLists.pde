import java.util.ArrayList;
import java.util.List;

public void setup() {
  // Declare and initialize
  // Arraylist< DATATYPE > = new ArrayList< DATATYPE >();

  ArrayList<String> cars = new ArrayList<String>();
  List<String> car2 = new ArrayList<String>();
  
  // toString is built in for raw outputs
  System.out.println(cars);
  
  // Add items to the end of an ArrayList
  cars.add("Toyota");
  cars.add("Ford");
  cars.add("Firetruck");
  System.out.println(cars);
  
  // Add items to a specific position of an array list
  cars.add(1, "Mazda");
  System.out.println(cars);
  
  // Remove an item from an Arraylist (first instance of the value)
  cars.remove("Toyota");
  System.out.println(cars);
  
  // Change the value of an item (first instance of the value)
  cars.set(0, "Firetruck");
  System.out.println(cars);
  
  // Retrieve the value of a position/index in the ArrayList
  System.out.println( cars.get(2) );
  
  // Retrieve the size/length of the list
  System.out.println( cars.size() );
  
  
}
