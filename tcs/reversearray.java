import java.util.*;
public class reversearray {

    static void printarry(int arr[],int n){
        System.out.print("Reversed array is:- \n");
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+ " ");
        }
    }
static void reserverarray(Integer arr[],int n){

    int[] ans = new int[n];
    for(int i=n-1;i>=0;i--){
        ans[n-i-1]=arr[i];
    }
    printarry(ans,n);
}
static void printArray(Integer arr[], int n) {
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
       System.out.print(arr[i] + " ");
    }
 }
 //Reverse array using library function
 static void reverseArray(Integer arr[]) {
    Collections.reverse(Arrays.asList(arr));
 }
 public static void main(String[] args) {

    Integer arr[] = {5,4,3,2,1};
    int n=arr.length;
    reserverarray(arr,n);
    reverseArray(arr);
    printArray(arr, n);
 }
}
