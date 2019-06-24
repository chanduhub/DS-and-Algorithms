public class InsertionSort{

     public static void main(String []args){
         
         int[] a = {2,5,4,3,1,7};
         
         for(int i = 1 ; i < a.length-1; i++){
             int value = a[i];
             int hole = i;
             while(hole>0 && a[hole-1]>value){
                 a[hole] = a[hole-1];
                 hole = hole -1;
             }
             a[hole] = value;
         }
         
         for(int i: a)
        System.out.println(i);
        
     }
}
