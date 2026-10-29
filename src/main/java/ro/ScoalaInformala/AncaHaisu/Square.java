package ro.ScoalaInformala.AncaHaisu;

import java.util.Objects;

public class Square implements Shape {
  private final double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double getArea() {
    return side * side;
  }

  @Override
  public double getPerimeter() {
    return 4 * side;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Square)) return false;
    Square square = (Square) o;
    return Double.compare(side, square.side) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(side);
  }
}
