package basics;

public class Dice {

	public static void simulateDice() {
		double dice = (Math.random() * 6);
		int roll = (int) Math.ceil(dice);
		System.out.println(roll);
	}

	public static void main(String[] args) {
		System.out.println("Simulating the dice");

		for (int i = 1; i < 100; i++) {
			simulateDice();
		}
	}

}
