package day17_ex;

public class DiceGame2 {

	public static void main(String args[]) throws Exception {
		DiceGame game = new DiceGame();
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result1);
		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) throws Exception {
		if (n < 0) {
			throw new Exception("던지는 횟수는 음수가 될 수 없습니다");
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (d1.play() == d2.play())
				count++;
			System.out.println();
		}
		return count;
	}

}
