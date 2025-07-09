public class EmployeeIDSorter {
    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] employeeIDs = {102, 45, 78, 123, 56, 89};
        System.out.println("Unsorted Employee IDs: ");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIDs);

        System.out.println("\nSorted Employee IDs: ");
        for (int id : employeeIDs) {
            System.out.print(id + " ");
        }
    }
}