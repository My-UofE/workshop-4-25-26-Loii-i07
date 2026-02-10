public class Circle{
    private double radius;
    private double originX;
    private double originY;

    public Circle(){
        //radius 1 at origin
        this(1.0, 0.0, 0.0);
    }

    public Circle(double radius, double originX,  double originY){
        setRadius(radius);
        this.originX =  originX;
        this.originY = originY;
    }

    public Circle(double radius){
        this(radius, 0.0, 0.0);
    }

    public double getRadius(){
        return this.radius;
    }

    public double getOriginX(){
        return this.originX;
    }

    public  double getOriginY(){
        return this.originY;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI *this.radius;
    }

    public void move(double dx, double dy){
        this.originX += dx;
        this.originY += dy;
    }

    public void scale(double factor){
        setRadius(this.radius * factor);
    }

    public boolean isOverlappedWith(Circle c) {
   
    if (this.originX  + this.radius < c.originX || c.originX + c.radius < this.originX){
      return false;
    }

     if(this.originY  + this.radius < c.originY || c.originY + c.radius < this.originY){
      return false;
  }
//if none of the aboove is true they must  be overlapping
  return true;
    }

  public String toString(){
    return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
  }  

  public boolean isEnclosedBy(Circle other){
    double dx = this.originX - other.getOriginX();
    double dy = this.originY - other.getOriginY();
    double distance = Math.sqrt(dx * dx + dy * dy);

    return (distance + this.radius) <= other.getRadius();
  }
}
