import java.util.ArrayList;
import java.util.List;

public class Deck {
	private final List<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public List<Card> shuffle() {
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		while (deck.size() > 0) {
			int index = (int) (Math.random() * deck.size());
			shuffledDeck.add(deck.remove(index));
		}
		return shuffledDeck;
	}

	public Card dealOneCard(List<Card> deck) throws EmptyDeckException {
		if (!deck.isEmpty()) {
			Card dealtCard = deck.get(deck.size() - 1);
			deck.remove(deck.size() - 1);
			return dealtCard;
		} else {
			throw new EmptyDeckException("No more cards in the deck");
		}

	}

}
