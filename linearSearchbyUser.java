//WAP to demonstrate passing of single dimeansional array to a function to perform linear search.
import java.util.*;
public class linearSearchbyUser{
public static int linearsearch(int key, int []a){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int n,val;
        Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the range of an array:    ");
	    n=sc.nextInt();
	    System.out.println("Enter the value to be seached:  ");
	    val=sc.nextInt();
	    int a1[]=new int[n];
	    for(int i=0;i<n;i++){
	        a1[i]=sc.nextInt();
	    }
	    System.out.println(val+" is found at index: "+linearsearch(val,a1));
    }
}