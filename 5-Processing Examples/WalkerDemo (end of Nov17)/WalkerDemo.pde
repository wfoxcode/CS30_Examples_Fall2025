private Walker miller, balfour, thom;

public void setup() {
  size(1200,700);
  background(255);
  frameRate(15);
  
  miller = new Walker(width/2, height/2);
  balfour = new Walker(width/2, height/2);
  thom = new Walker(width/2, height/2);
}

public void draw() {
  // movement 
  miller.move();
  balfour.move();
  thom.move();
  
  // refresh display
  background(255); // clear the screen
  miller.display();
  balfour.display();
  thom.display();
}
