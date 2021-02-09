package algo.sepCharacters;

public class SepCharacters {
    public static void main(String[] args) {
        String input = "abaccadd";
        char ch = 'a';
        int total = 0;

        /*
            Length of string does not matter. Just make 3 slices and check
            if there is a point where number of a's is equal in each of the
            substrings.

            Basically require 2 loops that can make 2 slices into the string.
         */

        for (int i = 0; i < input.length(); ++i) {
            for (int j = i; j < input.length(); ++j) {
                String subString1 = input.substring(0, i);
                String subString2 = input.substring(i, j);
                String subString3 = input.substring(j);

                if (subString1.length() > 0 && subString2.length() > 0) {
                    if (count(subString1, ch) == count(subString2, ch) &&
                            count(subString2, ch) == count(subString3, ch))
                        total ++;
                }
            }
        }

        System.out.println("Total: " + total);
    }

    private static long count(String subString1, char ch) {
        return subString1.chars().filter(x -> x == ch).count();
    }
}
