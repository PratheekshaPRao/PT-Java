
package mod2;
public class maxIndex {
    public static void main(String[] args){
        int[] arr={1,5,8,9,3,7,9};
        int max=arr[0];
        int maxindex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex=i;
            }
        }
        System.out.println("maximum element is: "+max+" at index " +maxindex);
        
        
            }
        }
    

