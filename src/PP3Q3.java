public class PP3Q3 {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 20, 40, 10, 40, 50};
        int max=arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest element in an array : " +max);
    }
}
