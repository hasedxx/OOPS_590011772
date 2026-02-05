
class ArrayDuplicate {
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    int arr2[] = {2, 5, 7, 8};
    public static void main(String[] args) {
        int count = 0;
        ArrayDuplicate obj = new ArrayDuplicate();

        for (int i = 0; i < obj.arr.length; i++) {
            for (int j = 0; j < obj.arr2.length; j++) {
                if (obj.arr[i] == obj.arr2[j]) {
                    count += 1;
                }
            }
        }
        if (count > 0) {
            System.err.println("Duplicate Found");
        } else {
            System.err.println("Not Found");
        }
    }
}
