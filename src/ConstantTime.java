/**
 * Big O notation or O(something) is nothing more than
 * representing the limit of an algorithm or data structure.
 *
 * NOTE: Big O notation is a mathematical definition that can
 * be more complex to define. Its definition is being emphasizing
 * the computational approach rather than the purely mathematical.
 *
 * Big O looks for how well does a algorithm scales as the input
 * grows larger/bigger.
 */

public class ConstantTime {

    /**
     * This function receives a list of numbers
     * and return the first value of such list. Take
     * into account that the efficiency is of constant time
     * because it does not matter how big/small the list is,
     * it will always calculate one operation.
     *
     * @param list
     * @return fisrt value
     */
    public static int BigO(int[] list) {
        return list[0]; // We can see that the function executes only one operation
                        // The efficiency is Big O of 1 or O(1)
    }
}
