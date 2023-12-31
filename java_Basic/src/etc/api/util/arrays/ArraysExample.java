package etc.api.util.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExample {

	public static void main(String[] args) {
	
		//배열의 복사
		char[] arr = {'J', 'A', 'V', 'A'};
		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr, 1, 3);
		
		arr[2] = 'F'; //원본배열만 영향 받음, 카피 배열은 영향 받지 않음
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//반드시 순서대로 정렬이 선행되어야 합니다. 
		
		int[] numbers = {1,3,5,7,9,11,13};
		System.out.println("9가 어딨어: " + Arrays.binarySearch(numbers, 4));
		
		//배열의 정렬
		Integer[] nums = {42,11,35,88,34,100};
		Arrays.sort(nums); //배열 정렬해줌
		System.out.println(Arrays.toString(nums));
		
		//내림차 정렬 (Integer[]을 지원)
		Arrays.sort(nums, Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
		
		//배열 내부 요소가 모두 동일한지의 여부 확인
		System.out.println(Arrays.equals(arr, arr2));
		
		
	}

}
