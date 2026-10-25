package ro.ScoalaInformala.AncaHaisu;

import java.util.HashSet;
import java.util.Set;

public class Tool {

  private final Set<Shape> shapes = new HashSet<>();

  public void addShape(Shape shape) {
    if (!shapes.add(shape)) {
      System.out.println("Duplicate shape detected!");
    }
  }

  public double getTotalArea() {
    return shapes.stream().mapToDouble(Shape::getArea).sum();
  }

  public double getTotalPerimeter() {
    return shapes.stream().mapToDouble(Shape::getPerimeter).sum();
  }
}
