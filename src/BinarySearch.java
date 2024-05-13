public class BinarySearch { // Binary search
    public int array2(int[] a, int item) {
        int first = 0;
        int last = a.length - 1;
        int middle;
        while (last >= first) {
            middle = (last + first) / 2;
            if (a[middle] == item) {
                return middle;
            }
            if (item < a[middle]) {
                last = middle - 1;
            }
            if (item > a[middle]) {
                first = middle + 1;
            }
        }
        return -1;
    }

}
