import java.util.List;

public class MainApp {
	public static void main(String args[]) {
		Deck deck = new Deck();
	   deck.shuffle();
		for (int x = 0; x < 53; x++) {
			try {
				System.out.println(deck.dealOneCard());
			} catch (EmptyDeckException e) {
				e.printStackTrace(System.out);
			}

		}
		System.out.print("end of code");

	}

}
