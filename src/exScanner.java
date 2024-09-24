import java.util.Scanner;

public class exScanner {
    public static void main(String[] args) {

        Scanner entra = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");

        String x = entra.next();

        System.out.println("Olá " + x + ", é um prazer!!");
    }
}
