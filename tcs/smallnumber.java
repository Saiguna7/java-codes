import java.util.*;
public class smallnumber{
    public static void main(String args[]){

        int arr1[]={2,5,1,3,0};

        System.out.println(smallnomoretime(arr1)+" is the smallest element in the array in o(N*log(N))");
        System.out.println(smallnomlesstime(arr1)+" is the smallest element in the array in o(N)");
        int arr2[]={8,10,5,7,9};
        System.out.println(smallnomoretime(arr2)+" is the smallest element in the array in o(N*log(N))");
        System.out.println(smallnomlesstime(arr2)+" is the smallest element in the array in o(N)");
    }
    static int smallnomoretime(int arr[]){
        Arrays.sort(arr);
        return arr[0];
    }
    static int smallnomlesstime(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]< min){
                min=arr[i];
            }
        }
        return min;
    }
}

