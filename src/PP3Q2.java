public class PP3Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 40, 50};
        int[] arr2 = new int[arr.length];
        int duplicate = -2;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr2[j] = duplicate;
                }
            }
            if (arr2[i] != duplicate)
                arr2[i] = count;
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != duplicate)
                System.out.println(arr[i]+" -> " + arr2[i]);
        }
    }
}
