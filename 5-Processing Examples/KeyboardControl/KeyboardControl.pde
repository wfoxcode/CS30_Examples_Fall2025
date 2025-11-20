private Player demo;

public void setup() {
  size(1200,800);
  
  demo = new Player(width/2, height/2);
}

public void draw() {
  background(255);
  demo.display();
  
}

public void keyPressed() {
  if (key == 'w') {
    demo.move(0);
  }
  else if (key == 'a') {
    demo.move(1);
  }
  else if (key == 's') {
    demo.move(2);
  }
  else if (key == 'd') {
    demo.move(3);
  }
}

//----------------------------------------------
public class Player {
  private int x, y, d;     // position and size
  private int cr, cg, cb;  //colours
  
  //Constructor
  public Player(int tempX, int tempY) {
    x = tempX;
    y = tempY;
    d = 70;
    
    // colours
    cr = 255;
    cg = 0;
    cb = 255;
    
  }
  
  public void display() {
    fill(cr, cg, cb);
    noStroke();
    circle(x, y, d);
    rect(x+4, y+20, d/4, d*1.5);
  }
  
  public void move(int dir) {
    if (dir == 0) { //UP
      y = y - 10;
    }
    else if (dir == 1) { //LEFT
      x = x - 10;
    }
    else if (dir == 2) { //DOWN
      y = y + 10;
    }
    else if (dir == 3) { //RIGHT
      x = x + 10;
    }
  }
  
}
