public class Colour {
  int red;
  int green;
  int blue;

  public Colour(int red, int green, int blue){
    this.red = red;
    this.green = green;
    this.blue = blue;
    
  }

  public Colour(String colString){
    this.red = 0;    
    this.green = 0;
    this.blue = 0;

    switch(colString) {
      case "black":
        // code block        
        break;
      case "red":
        // code block
        this.red = 255;    
        break;
      case "green":
        // code block
        this.green = 255;    
        break;
      case "blue":
        // code block
        this.blue = 255;    
        break;
      case "white":
        // code block
        this.red = 255;    
        this.green = 255;    
        this.blue = 255;    
        break;
      default:
        // code block
        break;
    }
    
  }

  public void lighter() {
    this.red *= 1.2;
    if (this.red>255) this.red = 255;
    this.green *= 1.2;
    if (this.green>255) this.green = 255;
    this.blue *= 1.2;
    if (this.blue>255) this.blue = 255;
  }

  public void darker() {
    this.red *= 0.8;
    this.green *= 0.8;
    this.blue *= 0.8;
  }

  public void showColour(){
    System.out.println("[" + red + ", " + green + ", " + blue + "]");
  }
}