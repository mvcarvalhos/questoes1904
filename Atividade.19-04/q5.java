import java.util.Scanner;

public class FibonacciRecursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        int resultado = calcularFibonacci(n);
        
        System.out.println("O " + n + "-ésimo número de Fibonacci é: " + resultado);
    }
    
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n; // caso base: retorna n quando n é menor ou igual a 1
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // recursivamente calcula o n-ésimo número de Fibonacci
        }
    }
}
