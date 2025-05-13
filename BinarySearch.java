/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA;

public class BinarySearch {
    int bs(int arr[],int l,int r,int ele){
        while(l<=r){
            int mid =(l+r)/2;
            if(arr[mid]==ele){
                return mid;  
            }
            else if(arr[mid]<ele){
                l=mid+1;  
            }
            else if(arr[mid]>ele){
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={5,9,17,23,45,59,63,71,89};
        int i=0;
        int l=0;
        int r=arr.length-1;
        int ele=39;
        BinarySearch b=new BinarySearch();
        int res=b.bs(arr,l,r,ele);
        if(res!=-1){
            System.out.println("ele found");
        }
        else{
            System.out.println("ele not found");
        }
    }   
}
