/**
 * This example is a representation of a popular
 * function in mathematics: linear function.
 *
 * Efficiency: O(n)
 */

public class NTime {
    /**
     * This function receives a list of numbers
     * and iterates through every element of the list.
     * When it searches for the element n, it immediately prints
     * it out, increment n by 1 and iterates again.
     *
     * This algorithm is not constant anymore because more than one
     * operation is being done. Let's break it down into pieces:
     *
     * 1) Store initial value for the variable n of type int
     * 2) Calculates the comparison (n < list.length)
     *
     * Bellow, we have two options of representing O(n)
     *
     * @param list
     */
    public static void BigO(int[] list) {
        // Option 1
        for (int n = 0; n < list.length; n++) {
            System.out.println(list[n]);
        }

        // Option 2
        for (int n : list) {
            System.out.println(list[n]);
        }
    }
}
