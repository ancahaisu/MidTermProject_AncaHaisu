package ro.ScoalaInformala.AncaHaisu;

import java.util.Objects;

public class Circle implements Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Circle)) return false;
    Circle circle = (Circle) o;
    return Double.compare(radius, circle.radius) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(radius);
  }
}
