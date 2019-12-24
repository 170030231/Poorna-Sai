import java.util.*;import java.io.*;
public class Min2{
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
        System.out.println("the min are "+s[1]+" "+s[0]+" max are "+s[n-1]+" "+s[n-2]);
    }
}