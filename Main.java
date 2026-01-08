
//Binary Search Algorithm with sorted Array 
public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 32, 45, 54, 60}; // sorted
        int target = 54;
        int start = 0;
        int end = arr.length - 1;
        int foundIndex = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                foundIndex = mid;
                break;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Found at index: " + foundIndex);
        } else {
            System.out.println("Not found");
        }
    }
}

