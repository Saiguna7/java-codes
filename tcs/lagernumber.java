import java.util.*;
public class lagernumber {
    public static void main(String args[]){
        int arr1[]={2,5,1,3,0};
        System.out.println(lagernomoretime(arr1)+" is the lagerest element in the array in o(N*log(N))");
        System.out.println(lagernomlesstime(arr1)+" is the lagerest element in the array in o(N)");
        int arr2[]={8,10,5,7,9};
        System.out.println(lagernomoretime(arr2)+" is the lagerest element in the array in o(N*log(N))");
        System.out.println(lagernomlesstime(arr2)+" is the lagerest element in the array in o(N)");
    }
    static int  lagernomoretime(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    static int  lagernomlesstime(int arr[]){
       int max=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       return max;
    }
}
