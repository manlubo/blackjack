package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();

	Deck shuffle() {
		for (int i = 0; i < cards.size(); i++) {
			int card = (int)(Math.random() * 52);
			Card tmp = cards.get(i);
			cards.set(i, cards.get(card));
			cards.set(card, tmp);
		}
		return null;
	}

}