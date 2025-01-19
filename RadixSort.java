public class RadixSort {
    public static void radixSort(Integer[] array) {
        int maxNumber = findMax(array);
        int maxDigits = countDigits(maxNumber);

        for (int place = 1; place <= maxDigits; place++) {
            System.out.println("Sorting by place: " + place);
            array = countingSortByDigit(array, place);
            System.out.println("Array after sorting by place: " + place);
            displayArray(array);
        }
    }

    // findMax will look at the array and determine the maximum number in the array
    // Input Size is the number of elements in the array
    // The loop iterates over the array once, so the time complexity is O(n)
    // Big-O: O(n)
    private static int findMax(Integer[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // countDigits will count the number of digits in a number
    // Logarithmic calculations are constant time operations for integers
    // Big-O: O(1)
    private static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return (int) Math.log10(number) + 1;
    }

    // countingSortByDigit will sort the array based on the place value of the numbers (ones, tens, hundreds, etc.)
    // Count occurrences of each digit O(n)
    // Calculate the prefix sum of the count array O(1)
    // Build the sorted array O(n)
    // Counting sort is repeated for each digit in the numbers (d digits in the maximum number)
    // Big-O: O(d * n)
    private static Integer[] countingSortByDigit(Integer[] array, int place) {
        int n = array.length;
        int[] count = new int[10];
        Integer[] sortedArray = new Integer[n];

        for (int num: array) {
            int digit = getDigit(num, place);
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int num = array[i];
            int digit = getDigit(num, place);
            sortedArray[--count[digit]] = num;
        }

        System.arraycopy(sortedArray, 0, array, 0, n);
        return array;
    }

    private static int getDigit(int number, int place) {
        return (number / (int) Math.pow(10, place - 1)) % 10;
    }

    public static void main(String[] args) {
        Integer[] array = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};

        System.out.println("Original Array: ");
        displayArray(array);

        radixSort(array);

        System.out.println("Sorted Array: ");
        displayArray(array);
    }

    public static void displayArray(Integer[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}