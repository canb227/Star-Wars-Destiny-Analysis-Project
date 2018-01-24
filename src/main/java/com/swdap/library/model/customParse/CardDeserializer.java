
package com.swdap.library.model.customParse;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.swdap.library.model.Card;
import com.swdap.library.model.CardDie;
import com.swdap.library.model.DieSide;

/**
 * 
 * Where the "magic" happens. Implements the JsonDeserializer class from GSON to allow it to be integrated into GSON's deserialization process.
 * Consumes a JsonObject that represents a single card in the SWDESTINYDB format.
 * 
 * @author sab3
 *
 */
public class CardDeserializer implements JsonDeserializer<Card> {

  /**
   * 
   * This is the method called by the GSON parser.
   * 
   */
  public Card deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
    JsonObject jsonObject = json.getAsJsonObject();
    Card card = new Card();
    deserializePrimatives(card, jsonObject);
    if (jsonObject.has("sides")) {
      card.setHas_Die(true);
      deserializeDie(card, jsonObject);
    }
    return card;
  }

  /**
   * 
   * If the card in question has a die, this will generate a CardDie object from the JSON
   * 
   * @param card The card object being generated.
   * @param obj A JSON Object representing the Card
   */
  private void deserializeDie(Card card, JsonObject obj) {
    CardDie die = new CardDie();

    DieStringParser dieParser = new DieStringParser(obj.get("sides").getAsJsonArray());

    die.setSide0(dieParser.parse(0));
    die.setSide1(dieParser.parse(1));
    die.setSide2(dieParser.parse(2));
    die.setSide3(dieParser.parse(3));
    die.setSide4(dieParser.parse(4));
    die.setSide5(dieParser.parse(5));

    card.setDie(die);
  }

  
  //TODO: All this nonsense
  private void deserializePrimatives(Card card, JsonObject obj) {

    card.setName(obj.get("name").getAsString());
    if (obj.has("subtitle") && !obj.get("subtitle").isJsonNull()) {
      card.setSubtitle(obj.get("subtitle").getAsString());
    } else {
      card.setSubtitle("NONE");
    }
  }

  //TODO: Maybe do this??
  private void safeMemberDeserialize(Card card, JsonObject obj, String memberName)
  {
    if (obj.has(memberName) && !obj.get(memberName).isJsonNull()) {
      card.setSubtitle(obj.get("subtitle").getAsString());
    }
  }

}
