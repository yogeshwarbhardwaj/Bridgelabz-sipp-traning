import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2; // Number of positions to rotate

        System.out.println("Original list: " + list);
        rotateList(list, rotateBy);
        System.out.println("Rotated list by " + rotateBy + ": " + list);
    }

    public static void rotateList(List<Integer> list, int k) {
        int size = list.size();
        if (size == 0) return; // Empty list check

        // Normalize the rotation value to handle larger or negative rotations
        k = k % size;
        if (k < 0) {
            k = k + size; // Convert negative rotation to equivalent positive rotation
        }

        // Reverse the entire list
        reverseList(list, 0, size - 1);
        // Reverse the first k elements
        reverseList(list, 0, k - 1);
        // Reverse the remaining elements
        reverseList(list, k, size - 1);
    }

    private static void reverseList(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}