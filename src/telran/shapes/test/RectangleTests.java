package telran.shapes.test;
import telran.shapes.Rectangle;
import telran.shapes.Square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {

	@Test
	void RectangleTest() {
		int width = 10;
		int height = 5;
		Rectangle rectangle = new Rectangle(width, height);
		assertEquals(width, rectangle.getWidth());
		assertEquals(height, rectangle.getHeight());
		rectangle.draw();
		width = 9;
		height = 7;
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		assertEquals(width, rectangle.getWidth());
		assertEquals(height, rectangle.getHeight());
		System.out.println("\n\n\n");
		rectangle.draw();
	}
	@Test
	void squareTest() {
		int width = 5;
		Square square = new Square(width);
		assertTrue(square.getHeight() == square.getWidth());
		assertEquals(width, square.getWidth());
		System.out.println("\n");
		square.draw();
		width = 10;
		square.setWidth(width);
		assertTrue(square.getHeight() == square.getWidth());
		assertEquals(width, square.getWidth());
		System.out.println("\n");
		square.draw();
	}
	 

}
