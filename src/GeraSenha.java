import java.security.SecureRandom;

public class GeraSenha {

    public static String gerarSenha(int tamanho, String caracteres) {
        StringBuilder senha = new StringBuilder();
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}