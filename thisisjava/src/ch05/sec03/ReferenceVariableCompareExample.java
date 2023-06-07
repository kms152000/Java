package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1; //배열 변수 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3	};
		arr2 = new int[] { 1, 2, 3	};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); //false: 저장 항목은 같지만 서로 다른 배열 객채로 생성된다. 따라서 대입되는 번지가 다르다.
		System.out.println(arr2 == arr3); //true: arr3은 arr2의 번지가 대입되었기 때문에 두 변수는 동일한 번지를 가지며 같은 배열은 참조한다.
	}
}

	