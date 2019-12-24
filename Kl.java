import java.util.*;import java.io.*;
public class Kl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int max=0,min=100000000;
        int n,i;
        n=sc.nextInt();
        int s[]=new int[n];
        for(i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(s[i]>max){
                max=s[i];
            }
            if(s[i]<min){
                min=s[i];
            }
        }
        System.out.println("min is"+min+" max is"+max);
    }
}