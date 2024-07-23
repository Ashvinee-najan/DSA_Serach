public class BinarySearch {
    public static int binarySearch (int arr[] , int N , int X){
        int low =0; int mid;
        int high = arr.length-1;
        while(low<=high){
             mid = low + (high-low)/2;
            if(arr[mid] ==X){
            return mid;
            }
            if(arr[mid] < X){//ignore high
             low = mid+1;
            }
            else{
             high = mid-1;
            }
        }
           return -1;
    }
    public static void main(String args[]){
        int arr[] = {10, 20,30, 40,50, 60, 70, 80};
        int X=50 ;
        int result = binarySearch(arr, arr.length, X);
        if(result ==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Element present at index "+result);
        }

    }

}
