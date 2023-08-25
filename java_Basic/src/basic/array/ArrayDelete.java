package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,11,13};
		//           0,1,2,3,4,5,6
//		arr[3] =arr[4];
//		arr[4] =arr[5];
//		arr[5] =arr[6]; //삭제하는 값을 기준으로 뒤에 있는 값을 땡겨옴
		
		
		//삭제되는 값을 기준으로 뒤에 있는 값을 한 칸씩 앞으로 땡기는 작업.
		// 추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해 하는 작업
		for(int i =3; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
//		System.out.println(Arrays.toString(arr));
		
		//기존의 배열보다 크기가 하나 작은 새 배열을 생성.
		int[] temp = new int[arr.length-1];
		
		//원본 배열의 값을 새 배열에 인덱스에 맞춰서 그대로 대입
//		System.out.println(Arrays.toString(temp));
		for(int j =0; j< temp.length; j++) {
			temp[j] = arr[j]; //j의 0번지부터 temp의 length까지 arr의 값이 들어감
		}
			arr = temp;
			temp = null;
		System.out.println(Arrays.toString(arr));
	}

}
