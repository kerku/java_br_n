package by.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Вася");
        hello("Петя");
        hello("ещё, кто бы это ни был");

        Square s = new Square(1);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area() + "см.");

        Rectangle r = new Rectangle(9, 12);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " см и " + r.b + " см = " + r.area() + "см.");

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
}	