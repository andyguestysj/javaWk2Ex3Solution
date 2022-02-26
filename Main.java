class Main {
  public static void main(String[] args) {
    
    Colour myRed = new Colour(255,0,0);
    Colour myBlue = new Colour("blue");
    Colour myShade = new Colour(100,100,100);

  
    myBlue.showColour();
    myBlue.darker();
    myBlue.showColour();

    myShade.showColour();
    myShade.lighter();
    myShade.showColour();

  }
}