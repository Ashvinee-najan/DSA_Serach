public class Occurance {
    public static int search(int arr[], int N , int X){
        int count =0 ;
        for(int i=0; i<N ; i++){
            if(arr[i]== X)
             return count++;
        }
        return count;
    }

    public static void main(String args[]){
     int arr[]= {10, 20, 20, 30, 40, 50, 60};
     int x=20;
     int count= search(arr, arr.length , X);
     if(count ==0)
     System.out.println("Elemeny not found");
     else
     System.out.println(count++);
    }
    
}
