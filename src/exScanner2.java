import java.util.Scanner;

public class exScanner2 {
    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String x = nome.next();

        System.out.println("Olá, " + x);

    }
}
