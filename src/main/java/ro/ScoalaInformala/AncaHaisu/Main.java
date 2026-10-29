package ro.ScoalaInformala.AncaHaisu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tool tool = new Tool();

        tool.addShape(new Square(5));
        tool.addShape(new Rectangle(4, 2));
        tool.addShape(new Circle(3));

        tool.addShape(new Square(5)); // test duplicate

        System.out.printf("Total Area for all shapes: %.2f%n", tool.getTotalArea());;
        System.out.printf("Total Perimeter for all shapes: %.2f%n", tool.getTotalPerimeter());
    }
}