import java.util.*;import java.io.*;
public class Asci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int s[]=new int[n];
        char ch[]=new char[n];
        for(i=0;i<n;i++){
            s[i]=sc.nextInt();
            ch[i]=(char)s[i];
            System.out.println(ch[i]);
            }
    }
}