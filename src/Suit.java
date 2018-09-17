
public enum Suit {
	SPADES(0), HEARTS(1), CLUBS(2), DIAMONDS(3);

	private int id;

	Suit(final int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

}
