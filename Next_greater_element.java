import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   int n=arr.length;
   int[]nge=new int[n];
   Stack<Integer>st=new Stack<Integer>();
   nge[n-1]=-1;
   st.push(arr[n-1]);
   for(int j=n-2;j>=0;j--){
    while(st.size()>0&&st.peek()<=arr[j]){
    st.pop();
    }
    if(st.size()==0){
    nge[j]=-1;
    }
    
    else{
    nge[j]=st.peek();
    }
    st.push(arr[j]);
 }
   return nge;
}
}
