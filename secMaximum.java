
package mod2;
public class secMaximum {
    public static void main(String[] args){
        int[] arr={12,45,23,67,89,67,89};
                int max=Integer.MIN_VALUE;
                int secMax=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>max){
                        secMax=max;
                        max=arr[i];
                    }
                    else if(arr[i]>secMax && arr[i]!=max){
                        secMax=arr[i];
                    }
                }
                if(secMax ==Integer.MIN_VALUE){
                    System.out.println("no second max element found");
                }else{
                    System.out.println("second max element is: " +secMax);
                    
                    
                    
                }
                }
    }

