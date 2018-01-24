
package com.swdap.library.model;

public class Card {

  CardDie die;
  
  String name;
  String subtitle;
  String type_code;
  String affiliation_code;
  String faction_code;
  String set_code;
  int health;
  String points;
  int cost;
  int position;
  String rarity_code;
  String code;
  String text;
  boolean hasDie;
  boolean is_unique;
  boolean has_errata;

  
  
  public CardDie getDie() {
    return die;
  }

  public void setDie(CardDie die) {
    this.die = die;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getType_code() {
    return type_code;
  }

  public void setType_code(String type_code) {
    this.type_code = type_code;
  }

  public String getAffiliation_code() {
    return affiliation_code;
  }

  public void setAffiliation_code(String affiliation_code) {
    this.affiliation_code = affiliation_code;
  }

  public String getFaction_code() {
    return faction_code;
  }

  public void setFaction_code(String faction_code) {
    this.faction_code = faction_code;
  }

  public String getSet_code() {
    return set_code;
  }

  public void setSet_code(String set_code) {
    this.set_code = set_code;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public String getPoints() {
    return points;
  }

  public void setPoints(String points) {
    this.points = points;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getRarity_code() {
    return rarity_code;
  }

  public void setRarity_code(String rarity_code) {
    this.rarity_code = rarity_code;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isHasDie() {
    return hasDie;
  }

  public void setHasDie(boolean hasDie) {
    this.hasDie = hasDie;
  }

  public boolean isIs_unique() {
    return is_unique;
  }

  public void setIs_unique(boolean is_unique) {
    this.is_unique = is_unique;
  }

  public boolean isHas_errata() {
    return has_errata;
  }

  public void setHas_errata(boolean has_errata) {
    this.has_errata = has_errata;
  }

  //TODO: Finish this thing
  public String prettyPrint()
  {
    return "Card Name: " + getName() + "\n" +
           "Card Die: \n" + getDie() + "\n";
  }
  
}
