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
      stroke(150);
    }
    else {
      fill(255);
      stroke(150);
    }
    
    rect(x,y,w,h);
  }
  
  public void click(int mx, int my) {
    
    if (mx>x  &&  mx<(x+w)  &&  my>y  &&  my<(y+h) ) {
      clicked = !clicked; //make it opposite
    }
    
  }
  
}
