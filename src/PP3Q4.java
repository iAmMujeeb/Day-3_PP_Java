public class PP3Q4 {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 20, 40, 10, 40, 50};
        int min=arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("largest element in an array : " +min);
    }
}
