package ro.ScoalaInformala.AncaHaisu;

import java.util.Objects;

public class Triangle implements Shape {
  private final double a;
  private final double b;
  private final double c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double getPerimeter() {
    return a + b + c;
  }

  @Override
  public double getArea() {
    double s = getPerimeter() / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Triangle)) return false;
    Triangle that = (Triangle) o;
    return Double.compare(a, that.a) == 0
        && Double.compare(b, that.b) == 0
        && Double.compare(c, that.c) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, c);
  }
}
