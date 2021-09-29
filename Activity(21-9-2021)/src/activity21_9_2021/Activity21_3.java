package activity21_9_2021;
class Line{
	public void line(){
		System.out.println("The line is drawn between two points");
		
	}
	
}
class Circle extends Line{
	public void circle(){
		System.out.println("The circle has a radius to measure");
		
	}
	
	
}
class Square extends Circle{
	public void square(){
		System.out.println("The square has all four sides equal");
		
	}
}
	
interface Drawable{
	void drawingColor();
	void thickness();
}
interface Filling{
	void fillingColor ();
	void size ();
}
public class Activity21_3 extends Square implements Drawable,Filling {

	public static void main(String[] args) {
		Activity21_3 obj=new Activity21_3();
//		Square obj2=new Square();
//		Circle obj3=new Circle();
		obj.drawingColor();
		obj.fillingColor();
		obj.line();
		obj.square();
		obj.circle();
		obj.thickness();
		obj.size();
		obj.fillingColor();
		

	}
	
	public void drawingColor() {
		System.out.println("This is a drawing color method");
		
	}
	public void thickness() {
		System.out.println("Thickness method will be called");
		
	}
	public void fillingColor () {
		System.out.println("The filling of color happens");
		
	}
	public void size () {
		System.out.println("The size varies frequently");
		
	}
	

}
