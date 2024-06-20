package day0620;

class YJY_다음에올숫자 {
	public int solution(int[] common) {
		int answer = 0;

		if (common[1] - common[0] == common[2] - common[1]) {
			int d = common[1] - common[0];
			answer = common[common.length - 1] + d;
		} else {

			int r = common[1] / common[0];
			answer = common[common.length - 1] * r;
		}

		return answer;
	}
}
