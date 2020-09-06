/**
 * This example is a representation of a popular
 * function in mathematics: quadratic function.
 *
 * Efficiency: O(n^2)
 */
public class Quadratictime {

    /**
     * This function receives a list of numbers
     * This alg takes a list and iterates though it.
     * It goes in order: the first loop is mapped to the
     * first element of the second loop. The second iteration,
     * we keep mapping the first element of the upper loop with
     * the next element of the inner loop... until we have mapped every
     * element in the upper loop with the inner loop. When it happens, we
     * move on to mapping the second element of the upper loop with the respective
     * elements in the inner loop...
     *
     * There will be two ways in which this will be coded.
     *
     * The efficiency is O(n^2)
     * @param list
     */
    public static void BigO(int[] list) {

        // Option #1
        for (int number1 : list) { // Everything is very similar to the prev example, but we have two
            for (int number2 : list) { // nested loops (one loop within another). This is where the efficiency becomes
                System.out.println("#1: " + number1 + "\n#2: " + number2); // heavier. The expression is O(n * n + 1) -> O(n^2 + 1) -> O(n^2)
            }
        }

        // Option #2
        for (int number1 = 0; number1 < list.length; number1++) {
            for (int number2 = 0; number2 < list.length; number2++) {
                System.out.println("#1: " + number1 + "\n#2: " + number2);
            }
        }
    }
}
