import java.util.*;

class QuickSort{

public void quickSort(int [] array){
  quickSort(array, 0, array.length-1);
}
public void quickSort(int [] array, int left, int right){
  int pivot = array[(low+high)/2];
  if (left >= right) return;
  int index = partition(array, left, right, pivot);
  quickSort(array, left, index-1);
  quickSort(array, index, right);
}
public void partition(int [] array, int left, int right, pivot){
  while(left<right){
  	while(array[left] < pivot) left++;
	while(array[right] > pivot) right++;
	if(left < right){
		
		swap(array, left, right);
		left++;
		right—;
			
	}

	
  }

	return left;

}


public void swap(int [] array, int index1, index2){

	temp = array[index1] ;
	array[index1] = array[index2[;
	array[index2] = temp; 
}
