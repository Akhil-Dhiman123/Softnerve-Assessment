import java.util.*;
import java.lang.*;
public class Problem1{

 //Function to find the leaders in the array.
 public static void leaders(int arr[], int n){

 //ArrayList to print leader elements in order of their appearance
 ArrayList<Integer> a = new ArrayList<Integer>();

 a.add(0,arr[n-1]);
 int max=arr[n-1];

 /*Traversing the array from right to left to chech if
 all elements to the right of current element are small

 and if this condition met, we store it in our ArrayList*/

 for(int i=n-2;i>=0;i--){
 if(arr[i] > max)
 {
 max = arr[i];
 a.add(arr[i]);
 }
 }

 /*Order of elements is reverse to the order of their appearance in the original
array
 so has to reverse the ArrayList to print the elements in order of their
appearance*/

 for (int i = 0; i < a.size() / 2; i++) {
 Integer temp = a.get(i);
 a.set(i, a.get(a.size() - i - 1));
 a.set(a.size() - i - 1, temp);
 }

 //print the elements in order of their appearance
 for(int i = 0;i<a.size();i++){
 System.out.print(a.get(i)+" ");
 }
 System.out.println(" ");
 }
public static void main(String[] args) {

 int arr[] = {7, 10, 4, 10, 6, 5, 2};
 int n=arr.length;
 leaders(arr,n);
}
}