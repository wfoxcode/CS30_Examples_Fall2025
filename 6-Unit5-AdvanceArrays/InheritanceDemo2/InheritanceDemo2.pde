public Enemy test1 = new Enemy(0,0);
public Enemy test2 = new EnemySq(200,200);

public void setup() {
  size(800,800);
}

public void draw() {
  background(255);
  test1.move();
  test1.display();
  
  test2.move();
  test2.display();
}
