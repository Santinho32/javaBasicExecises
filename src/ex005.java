import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        //Crie um objeto Scanner para ler o que vai ser inserido pelo usuário.
        Scanner ler = new Scanner(System.in);
        //Peça o para o usuário inserir o primeiro numero.
        System.out.println("Insira o primeiro número: ");
        //Leia e armazene o primeiro número.
        int x = ler.nextInt();

        //Peça para o usuário inserir o segundo numero.
        System.out.println("Insira o segundo número: ");
        //Leia e armazene o segundo número.
        int y = ler.nextInt();

        // Calcule o produto dos dois números e mostre o resultado.
        System.out.println(x + "x" + y + "=" + x*y);
    }
}
