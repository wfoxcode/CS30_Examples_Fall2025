import java.util.ArrayList;

ArrayList<Ball> b_list = new ArrayList<Ball>();

public void setup() {
  size(1280, 720);
  background(255);
  b_list.add( new Ball(width/2, height/2, 30) );
}

public void draw() {
  background(255);
  
  for (Ball b : b_list) {
    b.move();
    b.display();
  }
  
}

public void mousePressed() {
  b_list.add( new Ball(mouseX, mouseY, 30) );
}

public void keyPressed() {
  if (key == 'c') {
    // clear command
  }
}
