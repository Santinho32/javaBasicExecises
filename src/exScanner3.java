import java.util.Scanner;

public class exScanner3 {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = soma.nextInt();

        System.out.println("Digite o segundo número: ");
        int y = soma.nextInt();
        int z = x + y;
        System.out.println("A soma dos seus números é: " + z);
    }
}
