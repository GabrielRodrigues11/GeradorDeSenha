import java.util.Scanner;

public class EntradaDados {

    public static int obterTamanhoSenha() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Qual o tamanho da senha? ");
        return leitura.nextInt();
    }

    public static boolean incluirNumeros() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Deseja incluir números? (S/N): ");
        return leitura.nextLine().equalsIgnoreCase("S");
    }

    public static boolean incluirCaracteresEspeciais() {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Deseja incluir caracteres especiais? (S/N): ");
        return leitura.nextLine().equalsIgnoreCase("S");
    }
}