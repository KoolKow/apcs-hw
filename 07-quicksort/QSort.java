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
	    if(a[i] < piv){
		int temp = a[i];
		a[i] = a[wall];
		a[wall] = temp;
		wall++;
	    }
	}
	int rwall = wall;
	for(int j = wall; j<right; j++){
	    if(a[j] == piv){
		a[j] = a[rwall];
		a[rwall] = piv;
		rwall++;
	    }
	}
	a[right] = a[wall];
	a[wall] = piv;
	return (wall+rwall)/2;
    }

    public void quicksort2(int[] a,int left, int right){
	if(left >= right){
	    return;
	}
	else{
	    int n = partition(a,left,right);
	    quicksort2(a,left,n);
	    quicksort2(a,n+1,right);
	}
    }

    public static void main(String[]args){
	int[] a = {3,9,0,1,7,2,4,6,5,8};
	QSort q = new QSort();
	System.out.println(Arrays.toString(a));
	q.quicksort2(a,0,a.length-1);
	System.out.println("Result: "+Arrays.toString(a));

	int[] b = new int[10000000];
	Random r = new Random();
	for(int i = 0; i<b.length; i++){
	    b[i] = r.nextInt(100);
	}
	//System.out.println(Arrays.toString(b));
	q.quicksort2(b,0,b.length-1);
	//System.out.println("Result: "+Arrays.toString(b));
    }
}
