
package mod2;


public class segregation {
      public static void main(String[] args){
        int[] arr={0,1,0,1,1,0,0,1,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
        System.out.print("segregated array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
        }


