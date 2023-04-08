public class PP3Q5 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 10, 40, 50};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0)||(i==0))
                System.out.println(arr[i]);
        }
    }
}
