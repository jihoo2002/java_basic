package basic;

import java.util.Arrays;

public class Pre11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,9,11,13};
		
		for(int i =3; i< arr.length-1; i++) {
			//인덱스 3번지부터 베열 끝에서 하나 줄임->삭제하기 위해
			arr[i] = arr[i +1];
			
		}
		  System.out.println(Arrays.toString(arr));
	}

}
