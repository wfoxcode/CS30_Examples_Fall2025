import java.util.ArrayList;

ArrayList<Animal> pets = new ArrayList<Animal>(); //ArrayList holds Animal object

public void setup() {
  pets.add(new Dog("Labrador"));
  pets.add(new Cat());
  pets.add(new Animal());
  
  pets.get(0).speak();
  pets.get(1).speak();
  pets.get(2).speak();
}
