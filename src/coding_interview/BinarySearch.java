package coding_interview;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch.search(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }

    public int search(int[] arr, int l, int r, int x) {
        int mid = l + (r - l) / 2;
        if (l <= r) {
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);

            return search(arr, mid + 1, r, x);
        }
        return -1;
    }

}
