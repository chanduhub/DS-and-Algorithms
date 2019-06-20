public class SelectionSort{

     public static void main(String []args){
        
        int arr[] = {2,-6, 0, 4, -1, -5, -23};
        int n = arr.length;
        
        for(int i = 0 ; i < n-1 ; i++){
            
            int imin = i;
            
            for(int j = i+1 ; j < n ; j++){
                if(arr[j]<arr[imin])
                 imin = j;
            }
            
            int temp = arr[imin];
            arr[imin] = arr[i];
            arr[i] = temp;
        }
        
        for(int i: arr)
        System.out.println(i);
     }
}
