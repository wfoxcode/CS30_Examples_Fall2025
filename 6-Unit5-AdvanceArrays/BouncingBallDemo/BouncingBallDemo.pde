import java.util.ArrayList;

Ball test;

public void setup() {
  size(1280, 720);
  background(255);
  test = new Ball(width/2, height/2, 20);
}

public void draw() {
  test.display();
}
