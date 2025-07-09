public class BubbleSort {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {85, 42, 77, 64, 91, 53, 87};
        System.out.println("Before sorting:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        bubbleSort(studentMarks);

        System.out.println("\nAfter sorting:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}