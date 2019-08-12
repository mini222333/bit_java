package mini;

public class For8 {
	public static void main(String[] args) {
		String[] aa = {"aa","bb","cc","dd","ee"};
		String[] ab = {"aa","rt","cc","hj","ee"};
		
		for(int i=0;i<aa.length;i++) {
			if(aa[i].equals(ab[i])) {
				System.out.println(i+"번째는 서로 같은 데이터");
			}
			}
		}
		
	}
