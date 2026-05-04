import java.util.Scanner;

public class Cifra {

    public static String limpar(String p) {
        if (p == null) return "";
        
        StringBuilder sb = new StringBuilder();
        for (char c : p.toCharArray()) {
            
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a frase para processar:");
        String entrada = ler.nextLine();

        String textoLimpo = limpar(entrada);
        int n = textoLimpo.length();

        if (n == 0) {
            System.out.println("Texto vazio após a limpeza.");
            return;
        }

        System.out.println("Texto limpo: " + textoLimpo);

       
        StringBuilder cifra = new StringBuilder();
        
        System.out.println("Processando transposição...");
        for (int i = 0; i < n; i++) {
            
            int proximoIndice = (i * 3) % n;
            char letra = textoLimpo.charAt(proximoIndice);
            
            System.out.println("Posição original: " + proximoIndice + " -> Letra: " + letra);
            cifra.append(letra);
        }

        System.out.println("--- Resultado Final ---");
        System.out.println(cifra.toString());
        
        ler.close();
    }
}
