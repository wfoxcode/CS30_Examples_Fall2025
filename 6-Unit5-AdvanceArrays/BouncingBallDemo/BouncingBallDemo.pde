import java.util.ArrayList;

ArrayList<Ball> b_list = new ArrayList<Ball>();

public void setup() {
  size(1280, 720);
  background(255);
  b_list.add( new Ball(width/2, height/2) );
}

public void draw() {
  background(255);
  
  for (Ball b : b_list) {
    b.move();
    b.display();
  }
  
}

public void mousePressed() {
  b_list.add( new Ball(mouseX, mouseY) );
}

public void keyPressed() {
  if (key == 'c') {
    // Loop through backwards because it doesn't affect non-deleted index numbers
    for (int i = b_list.size()-1; i >= 0; i--) {
      b_list.remove(i);
    }
  }
}
