Button test = new Button(20,20,50,50,true);

Button[][] buttons;

public void setup() {
  size(1200,700);
  buttons = new Button[10][10];
  
  for (int cols = 0; cols < buttons.length; cols++) {
    for (int rows = 0; rows < buttons[cols].length; rows++) {
      buttons[cols][rows] = new Button(10 * cols, 10 * rows, 10, 10, true);
    }
  }
  
} //end of setup method





public void draw() {
  test.display();
}
