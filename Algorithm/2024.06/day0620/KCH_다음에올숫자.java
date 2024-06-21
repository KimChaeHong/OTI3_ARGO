package day0620;

public class KCH_다음에올숫자 {

	public int solution(int[] common) {
//		boolean check = isArithmetic(common);
//		int temp = 0 ;
//		int answer = 0;
//		if (true == check) {
//			temp = common[1] - common[0];
//			answer  = common[common.length-1] + temp;
//		} else {
//			temp = common[1]/common[0];
//			answer  = common[common.length-1] * temp;
//		}
//		return answer;
//	}
//
//	public boolean isArithmetic(int[] common) {
//		if (common[1] - common[0] == common[2] - common[1]) {
//			
//			return true;
//		}
//		return true;
//	}
//	
	int answer = 0;
    
    if ((common[1]-common[0]) == (common[2]-common[1])){
        answer = common[common.length-1]+(common[1]-common[0]);
    } else{
        answer = common[common.length-1]*((common[1]/common[0]));
    }
    
    return answer;
}

}
