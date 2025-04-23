package blackjack;

public class Card {
	int num;
	int kind;
	
	public Card(int num, int kind) {
		this.num = num;
		this.kind = kind;
	}

	@Override
	public String toString() {
		String nums = "123456789XJQK";
		String kinds = "♣♥◆♠";
		return "[ " + kinds.charAt(kind) + " , " + nums.charAt(num) + " ]";
	}
}
