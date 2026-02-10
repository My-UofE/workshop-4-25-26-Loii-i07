// A Rectangle class
public class Rectangle {
    // 1. Private fields - Hidden from the outside world
    private double width;
    private double height;
    private double originX;
    private double originY;

    //constructor.
  public Rectangle(double width, double height, double originX, double originY){
    this.setWidth(width);
    this.setHeight(height);
    this.originX = originX;
    this.originY = originY;
  }

//2nd constructor
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
}

//3rd constructor
public Rectangle(){
  // Calls the main constructor with default values: width 0, height 0, at origin (0,0)
  this(1, 1, 0, 0 );
}

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  public double getWidth() { 
    return width; 
    }

  public double getHeight() { 
    return height; 
    }

  public double getOriginX() { 
    return originX;
     }

  public double getOriginY() { 
    return originY;
     }

  public void setWidth(double width){
    this.width = width;
  } 

  public void setHeight(double height){
    this.height = height;
  }  


  // main constructor
  //public Rectangle(double w, double h, double oX, double oY) {
    //width = w;
    //height = h;
   // originX = oX;
   // originY = oY;
  //} 

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  public void scale(double scaleX,  double scaleY) {
    this.width *= scaleX;
    this.height *= scaleY;
  }

  public void scale(double factor) {
    this.scale(factor, factor);
  }

  public boolean isOverlappedWith(Rectangle r) {
    //checks if rrectangle is left or right of rectangle r
    if (this.originX  + this.width < r.originX || r.originX + r.width < this.originX){
      return false;
    }

    //checks if rectangle is below or above rectangle r
    if(this.originY  + this.height < r.originY || r.originY + r.height < this.originY){
      return false;
  }
//if none of the aboove is true they must  be overlapping
  return true;
  }

  public double calcRatio(){
    if (this.height == 0){
      return 0;
    }
    return this.width / this.height;
  }

  public boolean isSquare() {
    return Math.abs(this.width - this.height) < 0.000001;
  }
}
