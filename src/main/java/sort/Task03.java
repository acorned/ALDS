package sort;

public class Task03 {
    public static int binarySearchWithBias(int[] array, int num) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == num) {
                return mid;
            } else if ((array[mid] > num) ^ (array[high] > num) ^ (array[high] > array[mid])) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {13, 15, 17, 18, 1, 2, 5, 7};
        System.out.println(binarySearchWithBias(array, 5));
    }
}
