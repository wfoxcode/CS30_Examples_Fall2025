public class Walker {
  private int x, y, dx, dy; 
  private int size;
  
  public Walker(int tempX, int tempY) {
    //initial position and size
    x = tempX;
    y = tempY;
    size = 10;
    
    //velocity
    dx = size;
    dy = size;
  }
  
  public void display() {
    fill(255,0,0);
    square(x, y, size);
  }
  
  public void move() {
    int dir = (int) random(4);
    if (dir == 0) {
      y = y - dy; //up
    }
    else if (dir == 1) {
      x = x + dx; //right
    }
    else if (dir == 2) {
      y = y + dy; //down
    } 
    else if (dir == 3) {
      x = x - dx; //left
    }
  }
  
}
