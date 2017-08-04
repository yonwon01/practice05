package prob6;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return width*height;
	}

	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		return (2*width)+(2*height);
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width=width*s;
		height=height*s;
	}

}
