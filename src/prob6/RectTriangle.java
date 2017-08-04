package prob6;

public class RectTriangle extends Shape {
	double width;
	double height;
	public RectTriangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return (width*height)/2;
	}

	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		int bit=(int) Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2));
		return bit+width+height;
	}
	
	
}
