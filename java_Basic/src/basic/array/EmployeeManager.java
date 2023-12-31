package basic.array;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		int count =0;
		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
            System.out.println("# 1. 사원 정보 신규 등록");
            System.out.println("# 2. 모든 사원 정보 보기");
            System.out.println("# 3. 사원 정보 검색");
            System.out.println("# 4. 사원 정보 수정");
            System.out.println("# 5. 사원 정보 삭제");
            System.out.println("# 6. 프로그램 종료");            
            System.out.println("====================================");

            System.out.print("> ");
            int menu = sc.nextInt();
           
            if(menu ==1) {
            	//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
                //사번은 중복되면 안됩니다.
                //(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
            	//사번만 다시 입력받게 하기
            	outer: for(int i=0; i<100; i++) {
            	
            	System.out.println("# 사원 정보 등록을 시작합니다.");
            	System.out.print("사번을 입력하시오: ");
                String Nums = sc.next();
               
               
                for(String n : userNums ) {
            		if(Nums.equals(n)) {
            			System.out.println("이미 존재하는 사번입니다.");
            			continue outer;
            		}else {
            			break;
            		}
            	}
                userNums[count] = Nums;
                //i가 안되서 서치해서 count로 바꾸었더니 해결, 왜 i는 null로 나옴???
                //count는 등록된 회원 수만큼 늘어남.
            	System.out.print("이름을 입력하시오: ");
            	String name = sc.next();
            	names[count] = name;

            	System.out.print("나이를 입력하시오: ");
            	int age = sc.nextInt();
              	ages[count] = age;

            	System.out.print("부서명을 입력하시오: ");
            	String depa = sc.next();
            	departments[count] = depa;
            	count++; //다음 사람은 다음 인덱스에 저장하기 위해 미리 조치.
            	break;
            	
            	}
            	
            }else if(menu ==2) {
            	//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
                //만약 사용자가 사원 등록을 한 명도 하지 않았다면
                //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다. -->count가 하나씩 올라가게 해야함
            	if(count == 0) {
            		System.out.println("등록된 사원 정보가 없습니다.");
            	}else {
            		System.out.println("사원 정보");
            		System.out.println("============");
            		for(int i =0; i<count; i++) {
            			//등록된 사원 수만큼이니까  count로 했움.
//            			for(String us: userNums) {
//            				if(us == null) break;
//            				System.out.println("사번:" + us + " ");
//            			}
            			System.out.println("사번:" + userNums[i]);
//            			for(String n: names) {
//            				if(n == null) break;
//            				System.out.println("이름: " + n + " ");
//            			}
            			System.out.println("이름:" + names[i]);
//            			for( int a : ages) {
//            				if(a == 0) break;
//            				System.out.println("나이: " + a + " ");
//            			}
            			System.out.println("나이:" + ages[i]);
//            			for(String d : departments) {
//            				if( d == null) break;
//            				System.out.println("부서명: " + d + " ");
//            			}
            			System.out.println("부서명:" + departments[i]);
            			System.out.println("============");
            			
            		}
            	}
            	
            }else if(menu == 3) {
            	 //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
                //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력..
           System.out.println("사번을 입력하세요: ");
           String userNums2 = sc.next();
           
           
           boolean flag = false;
           for(int i =0; i<count; i++) {
        	   if(userNums2.equals(userNums[i])) {
        		   System.out.println("사번 : " +userNums[i]);
        		   System.out.println("이름 : " +names[i]);
        		   System.out.println("나이 : " +ages[i]);
        		   System.out.println("부서명 : " +departments[i]);
        		   flag = true;
        		   break;
        	   }
           }
           if(!flag) {
        	   System.out.println("조회하신 사원의 정보가 없습니다.");
           }
           
           
           
            }else if(menu ==4) {
            	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
            	//-->배열 속 값 밀어서 집어넣기 활용
            	System.out.println("사번을 입력하세요: ");
            	String userNums5 = sc.next();
            	
            	boolean flag = false;
            	for(int i =0; i<count; i++) {
            	if(userNums5.equals(userNums[i])) {
            		flag = true;
            		System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소] ");
            		System.out.println("> ");
            		int s = sc.nextInt();
            		
            		if(s ==1) {
            			System.out.println("나이를 다시 입력하세요: ");
            			ages[i] = sc.nextInt();
            			
            		
            		}else if(s ==2) {
            			System.out.println("부서를 다시 입력하세요: ");
            			departments[i] = sc.next();
            			
            			
            		}else if( s == 3) {
            			break;
            		}
             		// switch 문으로도 해보기 
            	if(!flag) {
            		System.out.println("조회하신 사번이 일치하지 않습니다.");
            	}
            	}
            	}
            	
            }else if(menu ==5) {
            	//사번을 입력받아서
                //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            	System.out.println("삭제하실 사원의 번호를 입력하세요: ");
            	String userNums3 = sc.next();
            	boolean flag = false;
            	
                for(int i =0; i<count; i++) {
            	if(userNums3.equals(userNums[i])) {
            		System.out.println("삭제할 사원 이름: " + names[i]);
            		System.out.println("정말 삭제하시겠습니까? [Y/N] ");
            		System.out.print("> ");
            		String userNum4 = sc.next();
            		
            		if(userNum4.equals("y")) {
            			flag = true;
            			if(i == userNums.length-1) {
            				//i가 젤 마지막 값인 경우 (인덱스99번인 경우) 뒤에서 떙겨올 값이 없음..
            				userNums[i] = null;
            				names[i] = null;
            				ages[i] = 0;
            				departments[i] = null;
            			} else {
            				for(int j =i; j<count; j++) {
                				userNums[i] = userNums[i +1];
                				names[i] = names[i+1];
                				ages[i] = ages[i+1];
                				departments[i] = departments[i +1];
                				
                			}
            			}
            			
            			count--; //count 바깥으로!!!
            			System.out.println(" 정보가 삭제되었습니다.");
            			break;
            			
            		}else if(userNum4.equals("n")) {
            			System.out.println("삭제를 취소합니다.");
            			break;
            		}else {
            			System.out.println("잘못 입력하셨습니다.");
            			System.out.println("메인 메뉴로 이동합니다.");
            		}
            	}
            	
                }
            }else if(menu ==6) {
            	System.out.println("프로그램을 종료합니다.");
            	sc.close();
            	break;
            }else {
            	System.out.println("메뉴를 잘못 입력하셨습니다.");
            }
		}
	}

}