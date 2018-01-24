
package com.swdap.library.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.swdap.library.model.Card;
import com.swdap.library.model.customParse.CardDeserializer;

/**
 * Testing Driver
 *
 */
public class App {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    FileReader fileIn = null;

    System.out.println("Insert json filename (resources folder): ");
    String fileName = in.nextLine();
    try {
      fileIn = loadJson(fileName);
    } catch (FileNotFoundException e) {
      System.out.println("No such file, try again. Theres no error handling sorry. :(");
      e.printStackTrace();
    }

    GsonBuilder gsonBuilder = new GsonBuilder();

    JsonDeserializer<Card> deserializer = new CardDeserializer();
    gsonBuilder.registerTypeAdapter(Card.class, deserializer);

    Gson customGson = gsonBuilder.create();
    Card[] cards = customGson.fromJson(fileIn, Card[].class);

    interactiveDebug(cards);
    in.close();
  }

  private static FileReader loadJson(String fileName) throws FileNotFoundException {
    App.class.getClassLoader().getResource(fileName).getFile();
    File file = new File(App.class.getClassLoader().getResource(fileName).getFile());
    return new FileReader(file);
  }

  private static void interactiveDebug(Card[] cards) {
    Scanner in = new Scanner(System.in);
    boolean cont = true;
    System.out.println("Cards parsed successfully.");

    while (cont) {
      System.out.println("Which card would you like info on? (Serial Card Number): ");
      int cardNumber = 0;

      try {
        cardNumber = Integer.parseInt(in.nextLine());
      } catch (Exception e) {
        System.out.println("Something went wrong!");
        e.printStackTrace();
      }

      System.out.println("---------------------------------------------------");
      System.out.println(cards[cardNumber].prettyPrint());
      System.out.println("---------------------------------------------------");

    }
    in.close();
  }
}
