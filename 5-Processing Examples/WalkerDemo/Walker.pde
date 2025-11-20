public class Walker {
  private int x, y, dx, dy; 
  private int cr, cg, cb;
  private int size;
  
  //Constructor
  public Walker(int tempX, int tempY) {
    //initial position and size
    x = tempX;
    y = tempY;
    size = 10;
    
    //velocity
    dx = size;
    dy = size;
    
    //Colour RGB values
    cr = (int) random(256);
    cg = (int) random(256);
    cb = (int) random(256);
  }
  
  public void display() {
    fill(cr, cg, cb);
    square(x, y, size);
  }
  
  public void move() {
    int dir = (int) random(4);
    if (dir == 0 && y > 0) {
      y = y - dy; //up
    }
    else if (dir == 1 && x < width) {
      x = x + dx; //right
    }
    else if (dir == 2 && y < height) {
      y = y + dy; //down
    } 
    else if (dir == 3 && x > 0) {
      x = x - dx; //left
    }
  }
  
}
