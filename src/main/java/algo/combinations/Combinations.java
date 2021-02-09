package algo.combinations;

public class Combinations {
    public static void main(String[] args) {
        String input = "abaccadd";

        System.out.println(getCombinations(input, 4, 0, new StringBuilder()));
    }

    private static int getCombinations(String input,
                                       int n,
                                       int start,
                                       StringBuilder currentString) {
        int total = 0;
        for (int i = start; i < input.length(); i++) {
            currentString.append(input.charAt(i));
            if (currentString.length() == n) {
                total++;
            } else {
                total += getCombinations(input, n, i+1, currentString);
            }

            currentString.deleteCharAt(currentString.length() - 1);
        }

        return total;
    }
}
