
package mod2;
public class secMin {
   public static void main(String[] args){
        int[] arr={12,45,23,67,89,67,89};
                int min=Integer.MAX_VALUE;
                int secMin=Integer.MAX_VALUE;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]<min){
                        secMin=min;
                        min=arr[i];
                    }
                    else if(arr[i]<secMin && arr[i]!=min){
                        secMin=arr[i];
                    }
                }
                if(secMin ==Integer.MAX_VALUE){
                    System.out.println("no second min element found");
                }else{
                    System.out.println("second min element is: " +secMin);
                    
                    
                    
                }
                } 
}
