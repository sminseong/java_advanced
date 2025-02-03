package day01.다형성01;

public class TestShape {
	public static void main(String[] args) {
		Shape[] shape = new Shape[2];
		for (int i=0; i<shape.length; i++) {
			shape[i] = new Shape() {
				@Override
				public void calculationArea() {

				}
			};
		}
		Circle circle = new Circle();
		Rectangular rectangular = new Rectangular();
		shape[0].setName("원");
		shape[1].setName("직사각형");

		circle.setRadius(10);
		rectangular.setWidth(10);
		rectangular.setHight(20);

		shape[1].setArea(rectangular.getArea());

		area(circle);
		area(rectangular);

		shape[0].print();
		shape[1].print();
		
	}
	public static void area(Shape shape) {
		shape.calculationArea();
	}
}