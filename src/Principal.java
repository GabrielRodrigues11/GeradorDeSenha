public class Principal {

    private static final String caracteresLetras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String caracteresNumeros = "0123456789";
    private static final String caracteresEspeciais = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static String gerarSenha() {
        int tamanho = EntradaDados.obterTamanhoSenha();
        boolean incluirNumeros = EntradaDados.incluirNumeros();
        boolean incluirEspeciais = EntradaDados.incluirCaracteresEspeciais();

        StringBuilder caracteres = new StringBuilder(caracteresLetras);
        if (incluirNumeros) {
            caracteres.append(caracteresNumeros);
        }
        if (incluirEspeciais) {
            caracteres.append(caracteresEspeciais);
        }

        return GeraSenha.gerarSenha(tamanho, caracteres.toString());
    }

    public static void main(String[] args) {
        String senha = gerarSenha();
        System.out.println("Senha gerada: " + senha);
    }
}