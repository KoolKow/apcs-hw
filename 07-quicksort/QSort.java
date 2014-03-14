import java.util.*;

public class QSort{

    public int partition(int[] a, int left, int right){
	Random rnd = new Random();
	int p = rnd.nextInt(right-left)+left;
	int piv = a[p];
	a[p] = a[right];
	a[right] = piv;
	int wall = left;
	for(int i = left; i<right; i++){
	    if(a[i] <= piv){
		int temp = a[i];
		a[i] = a[wall];
		a[wall] = temp;
		wall++;
	    }
	}
	a[right] = a[wall];
	a[wall] = piv;
	return wall;
    }

    public void quicksort2(int[] a,int left, int right){
	if(left >= right){
	    return;
	}
	else{
	    int n = partition(a,left,right);
	    quicksort2(a,left,n-1);
	    quicksort2(a,n+1,right);
	}
    }

    public static void main(String[]args){
	int[] a = {3,9,0,1,7,2,4,6,5,8};
	QSort q = new QSort();
	System.out.println(Arrays.toString(a));
	q.quicksort2(a,0,a.length-1);
	System.out.println("Result: "+Arrays.toString(a));
    }
}
