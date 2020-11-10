import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Shape shape = new Shape();
        //System.out.println(shape.area());
        //System.out.println(shape.perimeter());

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una figura:");
        System.out.println("1 Circulo");
        System.out.println("2 Cuadrado");
        System.out.println("3 Triangulo");

        int opcion = sc.nextInt();

        System.out.println("\nIntroduce la longitud o radio en cm:");
        int x = sc.nextInt();

        int calcular;

        switch (opcion) {
            case 1:
                Circle circle = new Circle(x);
                System.out.println("\nIntroduce una opción:");
                System.out.println("1 calcular Área");
                System.out.println("2 calcular Perímetro");
                calcular = sc.nextInt();
                if (calcular == 1) {
                    System.out.println("\nÁrea = " +circle.area());
                } else {
                    System.out.println("\nPerímetro = " +circle.perimeter());
                }
                break;
            case 2:
                Square square = new Square(x);
                System.out.println("\nIntroduce una opción:");
                System.out.println("1 calcular Área");
                System.out.println("2 calcular Perímetro");
                calcular = sc.nextInt();
                if (calcular == 1) {
                    System.out.println("\nÁrea = " +square.area());
                } else {
                    System.out.println("\nPerímetro = " +square.perimeter());
                }
                break;
            case 3:
                Triangle triangle = new Triangle(x);
                System.out.println("\nIntroduce una opción:");
                System.out.println("1 calcular Área");
                System.out.println("2 calcular Perímetro");
                calcular = sc.nextInt();
                if (calcular == 1) {
                    System.out.println("\nÁrea = " +triangle.area());
                } else {
                    System.out.println("\nPerímetro = " +triangle.perimeter());
                }
                break;
        }
    }
}
