package etc.api.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class LottoSimulator {
static Random r = new Random();
    
    static int prize1 = 0; //1등 당첨 횟수를 세 줄 변수
    static int prize2 = 0; //2등 당첨 횟수를 세 줄 변수
    static int prize3 = 0; //3등 당첨 횟수를 세 줄 변수
    static int prize4 = 0; //4등 당첨 횟수를 세 줄 변수
    static int prize5 = 0; //5등 당첨 횟수를 세 줄 변수
    static int failCnt = 0; // 당첨 횟수를 세 줄 변수
    
   public static Set<Integer> createLotto() { //set
	   Set<Integer> set = new HashSet<>();
//	      /*
//	       - 1~45 범위의 난수 6개를 생성하셔서
//	        컬렉션 자료형에 모아서 리턴해 주세요.
//	        무엇을 쓰든 상관하지 않겠습니다.
//	        중복이 발생하면 안됩니다.+6
//	       */ 
	   //6<6 ->false
	   
	    	while(set.size() < 6) {
	    		   int num = r.nextInt(45)+1;
	    		   set.add(num);
	    	}
	    	return set;
	    		  
	    }
//    
//    
//   보너스 번호를 생성하는 메서드(당첨번호 피해서 ) 
 public static int createBonusNum(Set<Integer> set) {
        /*
         - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
          당첨번호들을 피해서 보너스번호 하나만 뽑아 주세요.
          범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
         */
	 while(true) {
		 int bonus = r.nextInt(45)+1;
		 if(!set.contains(bonus)) { //당첨로또 번호 안에 보너스 번호가 없다면 리턴해라 
			 return bonus; //리턴값 주면 메서드 끝나기에 break 안써두 됨
		 		}
	 		}
 } 
	 
 
//    //당첨 등수를 알려주는 메서드
 public static void checkLottoNumber(Set<Integer>win, Set<Integer> myLotto, int bonus) {
//        /*
//         매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
//         내 로또 번호와 당첨번호를 비교하여
//         일치하는 횟수를 세 주신 후 등수를 판단하세요.
//         판단된 등수에 해당하는 static 변수의 값을 올려 주시면 됩니다.
//         6개 일치 -> 1등
//         5개 일치 + 보너스번호 일치 -> 2등
//         5개 일치 -> 3등
//         4개 일치 -> 4등
//         3개 일치 -> 5등
//         나머지 -> 꽝
//         */
	 int count =0;
		for(int nums: myLotto) { //구매한 로또번호 집합의 요소를 nums에 넣어줘서 당첨번호에 포함되는 지 확인
			if(win.contains(nums)) {//당첨번호랑 구매번호 요소 비교
				count++;
			}
		}
		if(count ==6) {
			prize1++;
			
		}else if (count ==5 ) {
			if(myLotto.contains(bonus))
			prize2++;
			else prize3++;
			
		}else if(count ==4) {
			prize4++;
			
		}else if(count ==3) {
			prize5++;
			
		}else {
			failCnt++;
			
		}
		
	}
  

    public static void main(String[] args) {
    	//로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
    	Set<Integer> win = createLotto(); //로또 번호를 win이라는 객체에 넣어줘야 고정됨.
        //보너스번호도 하나 고정시키세요. bonus객체에 보너스 번호 고정
      int bonus = createBonusNum(win); 

        
      int paper =0;
      long cost =0;
      
      while(true) {
        	
            /*
             - 1등이 당첨 될 때까지 반복문을 돌립니다.
             - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨 횟수를 출력하고
              반복문을 종료합니다.
             - 로또를 구매하기 위한 금액도 출력하세요. (long)
             */
    	  
        	Set<Integer> myLotto =createLotto(); //객체 생성, 내가 구매한 로또 번호 , 1장 살때마다 paper와 cost올려줘야 함
        	paper++; cost +=1000;
        	
        	checkLottoNumber(win, myLotto, bonus); //객체 생성한 거 메서드 안에 넣어주면 
        	
        	
        	
        	if(prize1 ==1) {
        		System.out.println("축하합니다 1등이에요");
        		System.out.printf("누적 당첨횟수\n2등: %d회\n3등: %d회\n4등: %d회\n5등: %d회\n꽝: %d회\n", 
        				prize2, prize3, prize4, prize5, failCnt);
        	System.out.println("로또 구입한 장수: " +paper +"장");
        	System.out.println("로또 구입한 총 비용: " +cost+ "원");
        	
        	break;
        	
        	}else {
        		System.out.println("로또" +paper + "장 째 구매 중..");
        	}
        	
        	
        }
	}
}
