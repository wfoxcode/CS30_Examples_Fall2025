public class Ball {
  public int x, y, dx, dy, r; 
  private int cr, cg, cb;
  private int grav;
  
  //constructor
  public Ball(int tempX, int tempY) {
    x = tempX;
    y = tempY;
    r = (int) random(10,40); //Radius
    
    dx = 0; //predefine
    dy = 0; //predefine
    grav = 1;
    
    while (dx == 0 && dy == 0) { //repeats if they match
      dx = (int) random(-7, 7);
      dy = (int) random(-7, 7);
    }
    
    cr = (int) random(0, 256);
    cg = (int) random(0, 256);
    cb = (int) random(0, 256);
  }
  
  public void display() {
    fill(cr,cg,cb);
    noStroke();
    circle(x,y,r*2);
  }
  
  public void move() {
    dy += grav; //deceleration or gravity
    x += dx; //x = x + dx;
    y += dy; //y = y + dy;
    
    if (y > (height - r) || y < r) {
      dy *= -1; // dy = dy * -1;
    }
    else if(x > width - r || x < r) {
      dx *= -1; // dx = dx * -1;
    }
    
  }
  
  public void checkCollision(Ball otherBall) {
    int radiusSum = r + otherBall.r;
    int distanceApart = (int) dist(x, y, otherBall.x, otherBall.y);
    
    if (distanceApart < radiusSum) {
      int tempDx = dx;
      int tempDy = dy;
      
      dx = otherBall.dx;
      dy = otherBall.dy;
      
      otherBall.dx = tempDx;
      otherBall.dy = tempDy;
    }
    
  }
  
  
} //end of class -----------------
