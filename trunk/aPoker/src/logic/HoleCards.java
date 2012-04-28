package logic;

import java.util.ArrayList;

public class HoleCards {

	// ===========================================================
	// Elements
	// ===========================================================

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public ArrayList<Card> cards;

	// ===========================================================
	// Constructors
	// ===========================================================

	public HoleCards()
	{
		cards = new ArrayList<Card>();
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public boolean setCards(Card c1, Card c2)
	{
		cards.clear();
		cards.add(c1);
		cards.add(c2);
		return true;
	}

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public void clear()
	{
		cards.clear();
	}

	int size()
	{
		return cards.size();
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}
