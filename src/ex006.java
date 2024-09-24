import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int x = calculo.nextInt();

        System.out.println("Insira o segundo número: ");
        int y = calculo.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " mod " + y + " = " + (x % y));

    }
}
