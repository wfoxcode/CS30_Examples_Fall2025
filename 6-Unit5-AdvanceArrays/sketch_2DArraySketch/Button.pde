public class Button {
  int x,y,w,h;
  boolean clicked;
  
  // Constructor
  public Button(int tempX, int tempY, int tempW, int tempH, boolean tempClick) {
    x = tempX;
    y = tempY;
    w = tempW;  //width
    h = tempH;  //height
    clicked = tempClick;
  }
  
  public void display() {
    if (clicked) {
      fill(0);
    }
    else {
      fill(255);
    }
    
    rect(x,y,w,h);
  }
  
  
}
