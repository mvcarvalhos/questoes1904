import java.util.Scanner;

public class SomaDigitosRecursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int soma = calcularSomaDigitos(numero);
        
        System.out.println("A soma dos dígitos é: " + soma);
    }
    
    public static int calcularSomaDigitos(int numero) {
        if (numero < 10) {
            return numero; // caso base: retorna o próprio número quando ele for menor que 10
        } else {
            int ultimoDigito = numero % 10; // obtém o último dígito do número
            int restoNumero = numero / 10; // obtém o número sem o último dígito
            
            return ultimoDigito + calcularSomaDigitos(restoNumero); // recursivamente calcula a soma dos dígitos do número sem o último dígito
        }
    }
}
