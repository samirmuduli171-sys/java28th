package java28th;

public class Main1 {
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,7,3,1,2};

        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printarray(arr);
    }
}
