package day0620;

public class KCH_다음에올숫자 {
	public int solution(int[] common) {
	int answer = 0;
    //등차인지 등비일지 체크
    if ((common[1]-common[0]) == (common[2]-common[1])){
    	//등차수열
        answer = common[common.length-1]+(common[1]-common[0]);
    } else{
    	//등비수열
        answer = common[common.length-1]*((common[1]/common[0]));
    }
    return answer;
}

}
