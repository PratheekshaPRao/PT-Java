
package mod2;
public class MinIndex {
  public static void main(String[] args){
        int[] arr={1,5,8,9,3,7,9};
        int min=arr[0];
        int minindex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                minindex=i;
            }
        }
        System.out.println("maximum element is: "+min+" at index " +minindex);
        
        
            }  
}
