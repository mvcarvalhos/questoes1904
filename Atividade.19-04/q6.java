import java.util.Scanner;

public class TorresDeHanoiRecursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de discos: ");
        int n = scanner.nextInt();
        
        System.out.println("Movimentos necessários:");
        resolverTorresDeHanoi(n, 'A', 'C', 'B');
    }
    
    public static void resolverTorresDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            resolverTorresDeHanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
            resolverTorresDeHanoi(n - 1, auxiliar, destino, origem);
        }
    }
}
