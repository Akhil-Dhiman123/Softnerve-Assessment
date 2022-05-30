public class Problem2{

//function to calculate maximum pfoit
public static int stockProfit(int[] arr)
{

 int n = arr.length;

 /*variables to keep track of the maximum and minimum price
 for each day*/
 int min = arr[0];
 int max = arr[0];



 int max_prf = 0;
 int diff=max-min;

 /*Calculating profit on each day using the pair of
 least buying price and highest sale price*/


 if(diff>max_prf)
 {
 max_prf = diff;
 }

 for(int i=1;i<n;i++)
 {
 if(arr[i] < arr[i-1]){
 if(arr[i] < min){
 min = arr[i]; }

 max = 0;

 }
 else if(arr[i] > arr[i-1]){

 max = arr[i];

 }
 if(max-min > max_prf){
 max_prf=(max-min);
 }

 }
 // Returning the maximum profit
 return max_prf;
 }


 //Driver Code
 public static void main(String[] args){
 int[] arr = {7,1,5,3,6,4};
 int max_profit = stockProfit(arr);
 System.out.println(max_profit);
 }
}