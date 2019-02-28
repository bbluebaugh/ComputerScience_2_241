
package collection;
/**
 *
 * @author bwbluebaugh0
 */
public class MySort 
{
    
    private MySort()
    {
        
    }
    
     public static void swap(MyVector v, int first, int second){
        Object temp = v.elementAt(first);
        v.replace(first, v.elementAt(second));
        v.replace(second, temp);
    }
     
    public static void bubbleSort(MyVector v){
        int i;
        int j;
        int n = v.size();
        Comparable first, second;
        for(i = 1; i < n; ++i){
            for(j = n-1; j>= i ; --j){
                first = (Comparable)v.elementAt(j-1);
                second = (Comparable)v.elementAt(j);
                if(first.compareTo(second) >0)
                {
                swap(v,j,j-1);
                }
            }
        }  
    }
    
    public static void selectionSort(MyVector v){
        int i;
        int j;
        int n = v.size();
        int smallPos;
        Comparable smallest, current;
        for(i = 0; i < n-1; ++i){
            smallPos = i;
            smallest = (Comparable)v.elementAt(smallPos);
            for( j = i+1; j < n; ++j){
                current = (Comparable)v.elementAt(j);
                if(current.compareTo(smallest)<0){
                    smallPos = j;
                    smallest = (Comparable)v.elementAt(j);
                }
            }
                if(smallPos != i){
                    swap(v, i, smallPos);
                }
        }
    }
    
    public static void mergeSort(MyVector v, Comparable[] temp, int left, int right)
    {   
	if(left == right) return;
	int mid = (left + right)/2, i, j, k;
        
	mergeSort(v, temp, left, mid);
	mergeSort(v, temp, mid + 1, right);
        
	for(j = left; j <= right; ++j)
        {
		temp[j] = (Comparable)v.elementAt(j);
	}
        
	i = left;
	k = mid + 1;
	for(j = left; j <= right; ++j)
        {
		if(i == mid + 1)
			v.replace(j, temp[j++]);
                
		else
			if(k > right)
				v.replace(j, temp[i++]);
                        
			else
				if(temp[i].compareTo(temp[k]) < 0)
					v.replace(j, temp[i++]);
                                
				else
					v.replace(j, temp[k++]);
	}
        
        
}   

    
    public static void quickSort(MyVector vec, int left, int right)
    {
	if(right - left < 10)
        {
		insertionSort(vec, left, right);
	}
	else
        {
		medianOf3(vec, left, right);
		int leftPtr = partition(vec, left, right);
		quickSort(vec, left, leftPtr - 1);
		quickSort(vec, leftPtr, right);
	}
    }
    
    
    public static void insertionSort(MyVector v, int left, int right)
    {
        int inner, outer;
        Object target;
        
        for(outer = left + 1; outer <= right; ++ outer)
        {
            target = v.elementAt(outer);
            inner = outer;
            while(inner > left && ((Comparable)target).compareTo(v.elementAt(inner - 1))<0)
                    {
                        v.replace(inner, v.elementAt(inner -1));
                        --inner;
                    }
            v.replace(inner, target);
        }
    }    
    
public static void shellSort(MyVector vec)
{
	int inner, outer;
	Object target;
	int h = 1;
	while(h > 0)
        {
		for(outer = h; outer < vec.size(); ++outer)
                {
			target = vec.elementAt(outer);
			inner = outer;
			while(inner > h - 1 && ((Comparable)(vec.elementAt(inner - h))).compareTo(target) > 0){
				vec.replace(inner, vec.elementAt(inner - h));
				inner -= h;
			}
			vec.replace(inner, target);
		}
		h = (h-1)/3;
	}
    }
    
    public static int partition(MyVector vec, int left, int right){
	Object pivot = vec.elementAt((left + right)/2);
	while(true){
		while(((Comparable)vec.elementAt(++left)).compareTo(pivot) < 0 );
		while(((Comparable)vec.elementAt(--right)).compareTo(pivot) >= 0);
		if(left > right)
			break;
		else
			swap(vec, left, right);
	}
	return left;
    }
    public static void medianOf3(MyVector v, int left, int right){
	int middle = (left + right)/2;
	if(((Comparable)v.elementAt(left)).compareTo(v.elementAt(middle)) > 0)
		swap(v, left, middle);
	if(((Comparable)v.elementAt(middle)).compareTo(v.elementAt(right)) > 0)
		swap(v, middle, right);
	if(((Comparable)v.elementAt(left)).compareTo(v.elementAt(middle)) > 0)//same as first if
		swap(v, left, middle);
    }
    
}
