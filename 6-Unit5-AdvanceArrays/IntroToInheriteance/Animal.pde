public class Animal {
  public int age;
  
  public Animal() {
    age = 0;
  }
  
  public void speak() {
    System.out.println("click click click");
  }
  
  public void eat() {
    System.out.println("Yum!");
  }
  
  public void sleep() {
    System.out.println("Zzzzzzz *SNORES");
  }
} // End of Animal Class ----------------------------------

public class Dog extends Animal { //Example of a child or sub class
  public String breed;
  
  public Dog(String tempBreed) {
    super(); //executes the constructor from the parent class
    breed = tempBreed;
  }
  
  public void speak() {  //overriding the parent method
    System.out.println("Woof! Woof! I'm a " + breed);
  }
  
} //end of dog class -----------------------------------------------

public class Cat extends Animal {
  public Cat() {
    super(); //execute the parent class constructor
  }
  
  public void speak() {
    System.out.println("MEOW!"); 
  }
  
} //end of Cat class ------------------------------------------------
