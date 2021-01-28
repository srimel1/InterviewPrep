import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] arr = populate(a, 5);

        Integer[] intArray = new Integer[5];
        Random rand = new Random();
        Arrays.fill(intArray, 1, 5, 4);
        Arrays.fill(intArray, (int) Math.random());

        System.out.println("Populated intArray: " + Arrays.toString(arr));

        rev(arr);

        System.out.println(Arrays.toString(arr));


        //print array
        System.out.println(Arrays.toString(arr));

        //reverse array
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));

        String[] arr1 = new String[5];
        arr1 = new String[]{"hi", "my", "name", "is", "steph"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(reverseStr(arr1)));

        System.out.println("Sorting: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Max in array: " + max(arr));
        System.out.println("Min in array: " + min(arr));


    }

    /***
     * reverse the int array
     * @param arr
     * @return
     */
    public static int[] reverse(int[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }

    /***
     * reverse the string array
     * @param arr
     * @return
     */
    public static String[] reverseStr(String[] arr) {
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            // swap the values at the left and right indices
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return arr;
    }

    /***
     * reverse the array
     * @param arr
     */
    public static void rev(int[] arr) {
        int[] temp = new int[5];
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(i + ": " + arr[i] + ", ");
        }
        System.out.println();

    }

    /***
     * popoulate the array
     * @param arr
     * @param n
     * @return
     */
    public static int[] populate(int[] arr, int n) {
        Random random = new Random(n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        return arr;
    }

    static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    /***
     * find max element in array
     * @param arr
     * @return
     */
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    /***
     * find the min element in array
     * @param arr
     * @return
     */
    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}