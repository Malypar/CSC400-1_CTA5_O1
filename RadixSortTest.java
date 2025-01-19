public class RadixSortTest {
    public static void main(String[] args) {

        Integer[] testArray = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        String message1 = "Original Array:";
        System.out.println(message1);
        RadixSort.displayArray(testArray);

        RadixSort.radixSort(testArray);

        String message2 = "Sorted Array:";
        System.out.println(message2);
        RadixSort.displayArray(testArray);

        Integer[] testArray2 = {854, 4564, 854, 9625, 10, 6878, 851, 458, 2, 8454};
        String message3 = "\nOriginal Array (Random Number Test):";
        System.out.println(message3);
        RadixSort.displayArray(testArray2);

        RadixSort.radixSort(testArray2);

        String message4 = "Sorted Array (Random Number Test):";
        System.out.println(message4);
        RadixSort.displayArray(testArray2);
    }
}
