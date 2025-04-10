public class Sorting {
    public static void main(String[] args){
        int[] arr = {100, 30, 50, 33, 60, 55, 70, 20, 10, 40};
        int n = arr.length;
        int temp;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
