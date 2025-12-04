public Button test = new Button(20,20,50,50,true);

public Button[][] buttons;
public int ROWS = 10, COLS = 10;
public int buttonW, buttonH;

public void setup() {
  size(1000,600);
  
  //set button width and height
  buttonW = width / COLS;
  buttonH = height / ROWS;
  
  //initialize the size
  buttons = new Button[10][10]; 
  
  //initializing the elements
  for (int i = 0; i < buttons.length; i++) {
    for (int j = 0; j < buttons[i].length; j++) {
      buttons[i][j] = new Button(i * buttonW, j * buttonH, buttonW, buttonH, false);
    }
  }
  
} //end of setup method

public void draw() {
  //test.display();
  
  for (int i = 0; i < buttons.length; i++) {
    for (int j = 0; j < buttons[i].length; j++) {
      buttons[i][j].display();
    }
  }
  
  
} //end of draw method

public void mousePressed() {
  //test.click(mouseX, mouseY);
  for (int i = 0; i < buttons.length; i++) {
    for (int j = 0; j < buttons[i].length; j++) {
      buttons[i][j].click(mouseX,mouseY);
    }
  }
}

public void keyPressed() {
  
}
