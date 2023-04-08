public class PP3Q8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 40, 50, 50};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}