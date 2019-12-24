import java.util.*;
import java.io.*;
public class Poo{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
n=sc.nextInt();
int s[]=new int[n];
for(i=0;i<n;i++){
s[i] = sc.nextInt();
sum=sum+s[i];
}
float avg;
avg=(float)sum/n;
System.out.println("avg is"+avg+"sum is"+sum);
}
}