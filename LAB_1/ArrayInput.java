public class ArrayInput {
    public static void main(String[] args) {

        String[] arr = new String[args.length];

        // Storing command-line arguments into array
        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }

        // Printing the array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
