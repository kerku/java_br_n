package by.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Вася");
        hello("Петя");
        hello("ещё, кто бы это ни был");

        double l = 6;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l) + "см.");

        double a = 6;
        double b = 7;
        System.out.println("Площадь прямоугольника со сторонами " + a + " см и " + b + " см = " + area(a, b) + "см.");

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}	