public class Main {
    public static boolean matrizContemPrimos(int[][] matriz) {
        // Verifica se a matriz está vazia
        if (matriz.length == 0) {
            return false;
        }
        
        // Verifica os elementos da primeira linha da matriz
        for (int i = 0; i < matriz[0].length; i++) {
            if (isPrimo(matriz[0][i])) {
                return true;
            }
        }
        
        // Remove a primeira linha da matriz
        int[][] novaMatriz = new int[matriz.length - 1][];
        for (int i = 1; i < matriz.length; i++) {
            novaMatriz[i - 1] = matriz[i];
        }
        
        // Chama a função recursivamente com a nova matriz
        return matrizContemPrimos(novaMatriz);
    }
    
    public static boolean isPrimo(int numero) {
        // Verifica se o número é igual a 2 (único número primo par)
        if (numero == 2) {
            return true;
        }
        
        // Verifica se o número é negativo, zero ou par
        if (numero < 2 || numero % 2 == 0) {
            return false;
        }
        
        // Verifica se o número é divisível por algum ímpar até sua raiz quadrada
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrizContemPrimos(matriz1));  // true
        
        int[][] matriz2 = {{4, 6, 8}, {10, 12, 14}, {16, 18, 20}};
        System.out.println(matrizContemPrimos(matriz2));  // false
    }
}
