/*Array consist of only 0's, 1's and 2's. Write an algorithm to sort  this array in O(n) time complexity and O(1) Space complexity with only one traversal 

Modify array so that it becomes : [0 0 1 1 2 2]
Hint1 : You are not suppose to use any extra space
Hint2 : You need change the same array with single traversal with O(n) time complexity

Solution:*/


import java.util.Arrays;

public class Main {
  public static int[] Sort012(int[] arr) {
    int low = 0, high = arr.length - 1;
		int i = 0;
		
		while(i <= high) {
				
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
				i++;
				continue;
			}
			
			if (arr[i] == 1) {
				i++;
				continue;
			}
			
			
			int temp = arr[high];
			arr[high] = arr[i];
			arr[i] = temp;
			high--;
		}
		
		return arr;
  }

  public static void main(String[] args) {
    int[] array = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

    Sort012(array);
    System.out.println(Arrays.toString(array));
  }
}
