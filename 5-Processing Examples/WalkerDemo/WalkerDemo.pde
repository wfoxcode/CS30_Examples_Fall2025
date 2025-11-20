private Walker[] wlist = new Walker[20]; //Array to store walkers
private int wcount = 0; //number of initialized walkers

public void setup() {
  size(1200,700);
  background(255);
  frameRate(15);
  
  wlist[0] = new Walker(width/2, height/2);
  wcount++;
}

public void draw() {
  // movement 
  for (int i = 0; i < wcount; i++) {
    wlist[i].move();
  }
  
  // refresh display
  //background(255); // clear the screen
  for (int i = 0; i < wcount; i++) {
    wlist[i].display();
  }
}

public void mousePressed() {
  if (wcount < wlist.length) {
    wlist[wcount] = new Walker(mouseX, mouseY);
    wcount++;
  }
}
