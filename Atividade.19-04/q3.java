import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinacoesRecursao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Informe o valor de k: ");
        int k = scanner.nextInt();

        List<List<Integer>> combinacoes = encontrarCombinacoes(n, k);
        System.out.println("Combinacoes:");
        for (List<Integer> combinacao : combinacoes) {
            System.out.println(combinacao);
        }
    }

    public static List<List<Integer>> encontrarCombinacoes(int n, int k) {
        List<List<Integer>> combinacoes = new ArrayList<>();
        encontrarCombinacoesRecursivo(n, k, 1, new ArrayList<>(), combinacoes);
        return combinacoes;
    }

    public static void encontrarCombinacoesRecursivo(int n, int k, int inicio, List<Integer> combinacaoAtual, List<List<Integer>> combinacoes) {
        if (k == 0) {
            combinacoes.add(new ArrayList<>(combinacaoAtual));
            return;
        }

        for (int i = inicio; i <= n; i++) {
            combinacaoAtual.add(i);
            encontrarCombinacoesRecursivo(n, k - 1, i + 1, combinacaoAtual, combinacoes);
            combinacaoAtual.remove(combinacaoAtual.size() - 1);
        }
    }
}
