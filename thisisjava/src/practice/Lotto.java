package practice;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] LottoNumbers = new int [6]; 
		Random num = new Random(); 

		//중복제거 
		for(int i = 0; i < LottoNumbers.length; i++) { 
			LottoNumbers[i] = num.nextInt(45)+1; 
		  for(int j = 0; j < i; j++) { 
		    if(LottoNumbers[i] == LottoNumbers[j]) { 
		      i--;
		    }
		  }
		} 

		//정렬 
		for(int i = 0; i < LottoNumbers.length; i++) { 
		  for(int j = 0; j < i;j++) { 
		    if(LottoNumbers[j] > LottoNumbers[i]) { 
		      int a = LottoNumbers[i]; LottoNumbers[i] = LottoNumbers[j]; LottoNumbers[j] = a; 
		    }
		  }
		}

		//출력
		for(int i = 0; i < LottoNumbers.length; i++) { 
			System.out.printf("%d ", LottoNumbers[i]); 
		}
    }
	
}
	
