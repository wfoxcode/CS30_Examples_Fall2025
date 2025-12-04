public class Ball {
  private int x, y, dx, dy, r; 
  private int cr, cg, cb;
  
  //constructor
  public Ball(int tempX, int tempY, int tempR) {
    x = tempX;
    y = tempY;
    r = tempR; //Radius
    
    dx = 1;
    dy = 1;
    
    cr = (int) random(0, 256);
    cg = (int) random(0, 256);
    cb = (int) random(0, 256);
  }
  
  public void display() {
    fill(cr,cg,cb);
    noStroke();
    circle(x,y,r*2);
  }
  
} //end of class -----------------
