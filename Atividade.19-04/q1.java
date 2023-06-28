import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os elementos do conjunto separados por vírgula: ");
        String input = scanner.nextLine();

        String[] elements = input.split(",");
        List<String> permutationList = generatePermutations(elements);

        System.out.println("Permutações possíveis: ");
        for (String permutation : permutationList) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(String[] elements) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(elements, 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(String[] elements, int index, List<String> permutations) {
        if (index == elements.length - 1) {
            permutations.add(String.join(",", elements));
        } else {
            for (int i = index; i < elements.length; i++) {
                swap(elements, index, i);
                generatePermutationsHelper(elements, index + 1, permutations);
                swap(elements, index, i);
            }
        }
    }

    private static void swap(String[] elements, int i, int j) {
        String temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}
