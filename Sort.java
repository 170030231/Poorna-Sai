import java.util.*;import java.io.*;
public class Sort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp=0;
        n=sc.nextInt();
        int s[]=new int[n];
        for(i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
            if(s[i]>s[j]){
                temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
        
            }
            }
            for(i=0;i<n;i++){
        System.out.println("the sorted array is"+s[i]);
}
}
}