import java.util.*;import java.io.*;
public class Pos{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,k,l=0,ct=0;
        n=sc.nextInt();
        int s[]=new int[n];
        for(i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++){
            if(s[i]==k){
                ct++;
                l=i+1;
            }
        }
        if(ct==0){
            System.out.println(-1);
        }else{
            System.out.println(+l);
        }
        
    }
}