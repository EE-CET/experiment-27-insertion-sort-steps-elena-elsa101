import java.util.Scanner;
   import java.util.*;
public class InsertionSortSteps {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++) a[i]=sc.nextInt();

int e=a[n-1];
int i=n-2;

while(i>=0 && a[i]>e){
a[i+1]=a[i];
for(int j=0;j<n;j++){
System.out.print(a[j]);
if(j<n-1) System.out.print(" ");
}
System.out.println();
i--;
}

a[i+1]=e;
for(int j=0;j<n;j++){
System.out.print(a[j]);
if(j<n-1) System.out.print(" ");
}
}
}
