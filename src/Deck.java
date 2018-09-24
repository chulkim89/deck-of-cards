import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public void shuffle() {
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		Random rnd = new Random();
		while (deck.size() > 0) {
			shuffledDeck.add(deck.remove(rnd.nextInt(deck.size())));
		}
		deck = shuffledDeck;
	}

	public Card dealOneCard() throws EmptyDeckException {
		if (!deck.isEmpty()) {
			Card dealtCard = deck.get(deck.size() - 1);
			deck.remove(deck.size() - 1);
			return dealtCard;
		} else {
			throw new EmptyDeckException("No more cards in the deck");
		}

	}

}
