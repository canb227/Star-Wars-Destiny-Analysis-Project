
package com.swdap.library.model;

public enum Symbol {
  MELEE("MD", "Melee Damage"),
  RANGED("RD", "Ranged Damage"),
  INDIRECT("ID", "Indirect Damage"),
  RESOURCE("R", "Resource"),
  SHIELD("Sh", "Shield"),
  SPECIAL("S", "Special"),
  BLANK("-", "Blank");

  private String code;
  private String label;

  Symbol(String code, String label) {
    this.code = code;
    this.label = label;
  }

  public String getCode() {
    return this.code;
  }

  public String getLabel() {
    return this.label;
  }

  public static Symbol fromString(String text) {
    for (Symbol s : Symbol.values()) {
      if (s.code.equalsIgnoreCase(text)) {
        return s;
      }
    }
    return null;
  }

  public String toString() {
    return this.label;
  }
}