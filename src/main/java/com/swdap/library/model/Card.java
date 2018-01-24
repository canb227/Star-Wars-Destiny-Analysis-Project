
package com.swdap.library.model;

public class Card {

	String name;
	DSet set;
	DType type;
	DAffiliation affil;
	DFaction faction;
	DRarity rarity;

	CardDie die;

	String subtitle;

	int health;
	String points;
	int cost;
	int positionInSet;

	String code;
	String text;

	String passive;
	String action;
	String powerAction;
	String special;

	boolean has_Die;
	boolean is_unique;
	boolean has_errata;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CardDie getDie() {
		return die;
	}

	public void setDie(CardDie die) {
		this.die = die;
	}

	// TODO: Finish this thing
	public String prettyPrint() {
		return "Card Name: " + getName() + "\n" + "Card Die: \n" + getDie() + "\n";
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;

	}

	public void setHas_Die(boolean b) {
		this.has_Die = b;

	}

}
