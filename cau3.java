
class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		super();

	}

	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled  = filled;
		
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color= color;
	}

	public boolean getfilled() {
		return filled;
	}

	public void setfilled(boolean filled) {
		this.filled = filled ;
	}

}

 class Cricle extends Shape {
	private double radius ;
	private double Area;
	private double Perimeter;
	public Cricle() {
		
	}

	public Cricle(String color, boolean filled,double radius,double Area, double Perimeter) {
		super(color, filled);
		
		this.radius = radius;
	}

	public double getradius() {
		return radius;
	}

	public void setradius(double radius) {
		this.radius = radius;
	}	

	public double getArea(){
		return Area;
	}
	public void setArea(){
		this.Area = Area;
	}

	public double getPerimeter(){
		return Perimeter;
	}

	public void setPerimeter(){
		this.Perimeter = Perimeter;
	}

}

 class Rectangle extends Shape {
private double width;
private double length;
	

	public Rectangle(String color, boolean filled,double width, double length) {
		super(color, filled);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}


	public double getlength() {
		return length;
	}

	public void setlength(double length) {
		this.length = length;
	}
  
}

class Square extends Rectangle{

	 double side;
	
	public Square(String color, boolean filled,double width, double length, double side) {
		super(color, filled,width,length);
		
		this.side=side;
	}

	public double getside() {
		return side;
	}

	public void setside(double side) {
		this.side = side;
	}

}

public class cau3 {

	public static void main(String[] args) {
		Cricle cr = new Cricle("while",true,2.2,4.3,9.9);
		Rectangle r = new Rectangle("pink",true,1.75,2.22);
		Square sq = new Square("yellow",true,1.80,2.33,4.0);
		System.out.println("Cricle");
		System.out.println("color:" + cr.getcolor());
		System.out.println("Rectangle");
		System.out.println("Rectangle: " + r.getcolor());
		System.out.println("Square");
		System.out.println("Square: " + sq.getcolor());
	}
  
}