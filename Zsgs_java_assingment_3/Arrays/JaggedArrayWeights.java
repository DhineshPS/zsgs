import java.util.Scanner;

public class JaggedArrayWeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of persons (N):");
        int n = scanner.nextInt();

        int[][] weights = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of weights for person " + (i + 1) + ":");
            int numberOfWeights = scanner.nextInt();
            weights[i] = new int[numberOfWeights];
            System.out.println("Enter the weights for person " + (i + 1) + ":");
            for (int j = 0; j < numberOfWeights; j++) {
                weights[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the person index (0 to " + (n - 1) + ") and weight index to retrieve:");
        int personIndex = scanner.nextInt();
        int weightIndex = scanner.nextInt();
        int weight = getWeight(weights, personIndex, weightIndex);
        System.out.println("Weight of person " + (personIndex + 1) + " at index " + weightIndex + " is: " + weight);

        System.out.println("Enter the person index (0 to " + (n - 1) + ") to find the minimum weight:");
        int minWeightPersonIndex = scanner.nextInt();
        int minWeight = findMinimumWeight(weights, minWeightPersonIndex);
        System.out.println("The minimum weight for person " + (minWeightPersonIndex + 1) + " is: " + minWeight);
    }

    public static int getWeight(int[][] weights, int personIndex, int weightIndex) {
        if (personIndex < weights.length && weightIndex < weights[personIndex].length) {
            return weights[personIndex][weightIndex];
        } else {
            System.out.println("Invalid index");
            return -1;
        }
    }

    public static int findMinimumWeight(int[][] weights, int personIndex) {
        if (personIndex < weights.length && weights[personIndex].length > 0) {
            int minWeight = weights[personIndex][0];
            for (int weight : weights[personIndex]) {
                if (weight < minWeight) {
                    minWeight = weight;
                }
            }
            return minWeight;
        } else {
            System.out.println("Invalid person index or no weights available");
            return -1;
        }
    }
}