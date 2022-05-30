public class Problem3{
 //function to calculate XOR sum of all the elements of array
 static void subset(String s,int idx,String newstring,int[] sum){
 /* Base Case: If subset is found,then we will find the XOR of all
 its elements and Will add it to our final sum*/

 if(idx==s.length()){

 //if suset is empty, we will print the sum as zero
 if(newstring == null){
 sum[0]+=0;
 return;
 }

 //if subset is a single element,then its XOR is its value itself//
 if(newstring.length()==1){
 sum[0]+=(int)(newstring.charAt(0)-'0');
 return;
 }

 /*else we will find XOR of all elements of subset,and will
 add it into our final value*/
 else{
 int XOR=0;
 for(int i=0;i<newstring.length() ; i++){
 XOR = XOR^((int)(newstring.charAt(i)-'0'));
 }
 sum[0]+=XOR;
 }
 return;
 }

 /* At every stage,every character of the array has the choice to either
 be included in subset,or not*/

 char a = s.charAt(idx);

 //To be included
 subset(s,idx+1,newstring+a,sum);

 //To be not included
 subset(s,idx+1,newstring,sum);
 }

 //Helping Function to convert array to String
 public static int subsetXORSum(int[] nums) {

 String s="";
 String nl ="";
 for(int i = 0; i<nums.length; i++){
 s=s+(char)(nums[i] + '0');
 }
 String cpy =s;
 int[] sum={0};
 int sum2=0;
 subset(s,0,nl,sum);
 sum2=sum[0];
 return sum2;
 }

 //Driver Code
 public static void main(String[] args){
 int[] arr = {5,1,6};
 int XORsum = subsetXORSum(arr);
 System.out.println(XORsum);
 }
}