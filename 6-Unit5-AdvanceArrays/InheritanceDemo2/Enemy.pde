public class Enemy {
  protected int x, y, w, h;
  protected int dx, dy;
  protected int type;
  
  public Enemy(int tempX, int tempY) {
    x = tempX;
    y = tempY;
    dy = 1;
    dx = 1;
    w = 30;
  }
  
  //Default type
  public void display() {
    fill(0);
    circle(x, y, w);
  }
  
  //Default move
  public void move() {
    x = x + dx;
    y = y + dy;
  }
  
} // end of Enemy class ---------------------------------

public class EnemySq extends Enemy {
  
  public EnemySq(int tempX, int tempY) {
    super(tempX, tempY); //new Enemy(5, 7) in the main
    
    w = 50;
    h = 50;
    type = 1;
  }
  
  // override the parent method
  public void display() {
    fill(255,0,0);
    rect(x,y,w,h);
  }
  
}
