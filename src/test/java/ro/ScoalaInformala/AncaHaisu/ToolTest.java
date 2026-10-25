package ro.ScoalaInformala.AncaHaisu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToolTest {

  @Test
  void addSingleShape() {
    Tool tool = new Tool();

    tool.addShape(new Square(2));

    assertEquals(4, tool.getTotalArea());
    assertEquals(8, tool.getTotalPerimeter());
  }

  @Test
  void addDuplicateShapes() {

    Tool tool = new Tool();

    tool.addShape(new Square(2));
    tool.addShape(new Square(2));

    assertEquals(4, tool.getTotalArea());
    assertEquals(8, tool.getTotalPerimeter());
  }

  @Test
  void addTwoDifferentShapes() {
    Tool tool = new Tool();

    tool.addShape(new Square(2));
    tool.addShape(new Rectangle(2, 3));

    assertEquals(10, tool.getTotalArea());
    assertEquals(18, tool.getTotalPerimeter());
  }

  @Test
  void addAllShapeTypes() {

    Tool tool = new Tool();

    tool.addShape(new Square(2));
    tool.addShape(new Rectangle(2, 3));
    tool.addShape(new Circle(1));
    tool.addShape(new Triangle(3, 4, 5));

    assertEquals(4, tool.getTotalArea(), 100); // verifică că există și se calculează
  }
}
