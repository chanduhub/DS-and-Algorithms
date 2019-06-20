public class BubbleSort{

     public static void main(String []args){
        
        int arr[] = {2,-6, 0, 4, -1, -5, -23, -52,5};
        int n = arr.length;
        
        for(int i = 0 ; i < n-1 ; i++){
            int flag = 0; // helps in best case by O(n)
           for(int j = 0 ; j < n-i-1; j++){ // here i is used to stop before sorted part
                if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  flag = 1;
                }
            }
            if(flag==0)
            break;
            
           
        }
        
        for(int i: arr)
        System.out.println(i);
     }
}
