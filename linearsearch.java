public class linearsearch
{
public static int linearSearch(int arr[], int key){
    for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
}
public static void main(String[] args) {
	    int []a1={10,20,30,50,70,90};
	    int key=50;
	    int i=linearSearch(a1,key);
	    if(i==1)
		    System.out.println("Element not found");
		else
		    System.out.println("Element found at "+i);
	}
}
