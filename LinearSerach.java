class Hello{
    public static int search(int arr[] , int N , int x){
        for(int i=0; i<N ; i++){
            if(arr[i]==x)
                return i;
            
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 40,30, 50, 60,70, 80};
        int x = 50;
        int result = search(arr , arr.length , x);
        if(result == -1)
           System.out.println("Element Not found"); 
        
        else
            System.out.println("Elment found atindex :" + result);
        
   
    }
}
