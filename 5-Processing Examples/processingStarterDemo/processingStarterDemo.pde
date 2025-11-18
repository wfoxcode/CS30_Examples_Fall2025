private int x, y; //circle position

public void setup() {
  size(700,700);
  x = width / 2;
  y = height / 2;
}

public void draw() {
  x = x + 1;
  
  background(150,255,150);
  fill(255,100,100);
  stroke(0,0,0);
  circle(x,y,100);
}
