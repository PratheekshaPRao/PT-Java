
public class minNo {
    public static void main(String[] args){
        int[]n={11,7,3,4};
        int min=n[0];
        for(int i=1;i<n.length;i++){
            if(min>n[i])
            {
                min=n[i];
            }
        }
        System.out.println(min);
    }
}
