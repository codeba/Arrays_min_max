package patika;

public class Arrays_Min_Max {
    public static void main(String[] args) {
        int arr[] ={1,3,5,7,9,11,13};
        int min=arr[0];
        int max=arr[0];
        for (int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
