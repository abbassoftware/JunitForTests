
public class MyMath {

    /**
     * @param a
     * @param b
     * @return - The addition of a and b.
     */
    public int addTwoNumbers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new UnsupportedOperationException();
        }
        return a + b;
    }

    /**
     * @param a
     * @return - The maximum element in the array
     */
    public int findMaxNumberFromArray(int a[]) {
        int max = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * This function sorts an array in ascending order.
     * 
     * @param a
     */
    public void sortAnArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
