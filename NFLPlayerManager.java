import java.util.*;

 /**Program: NFLPlayerManager
 * File: NFLPlayerManager.java
 * Summary: Create a NFL player array from the NFLPlayer
 * class 
 * Author: Eric George
 * Date: December 9, 2018
 */
public class NFLPlayerManager{
  //Create ArrayList of players
  final private static ArrayList<NFLPlayer> LIST_OF_PLAYERS = new ArrayList<NFLPlayer>();
  //Create player manager object with no args
  public NFLPlayerManager(){
    playerlist();
  }
  //Create player list for Array
  public static void playerlist(){
    //Add offensive players
    NFLPlayer brady = new OffensivePlayer("Tom Brady", 41, 193.04, 225.0, "QB", 12, 98.2, 477, 313, 3700.0, 23, 23, 35.0, 2, 4, 2, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/BRA371156.png");
    NFLPlayer edelman = new OffensivePlayer("Julian Edelman", 32, 177.80, 198.0, "WR", 11,  87.0, 2, 2, 43.0, 0, 7, 83.0, 0, 1, 0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/EDE425791.png");
    NFLPlayer rodgers = new OffensivePlayer("Aaron Rodgers", 35, 187.96, 225.0, "QB", 12, 99.6, 495, 307, 3700.0, 35, 212.0, 0, 6, 3, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/ROD339293.png");
    NFLPlayer kamara = new OffensivePlayer("Alvin Kamara", 23, 177.80, 215.0, "RB", 41, 90.0, 0, 70, 591.0, 4, 173, 793.0, 11, 1, 0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/KAM244058.png");
    NFLPlayer cobb = new OffensivePlayer("Randall Cobb", 28, 177.80, 192.0, "WR", 18, 81.0, 0, 34, 326.0, 2, 0, 0.0, 0, 2, 1, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/COB365535.png");
    NFLPlayer adams= new OffensivePlayer("Davante Adams", 25, 185.42, 215.0, "WR", 17, 91.0, 0, 100, 1315.0, 12, 0, 0.0, 0, 0, 0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/ADA218591.png");
    NFLPlayer brees= new OffensivePlayer("Drew Brees", 39, 182.88, 209.0, "QB", 9, 120.8, 415, 314, 3463.0, 31, 28, 25.0, 4, 5, 1, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/BRE229498.png");
    NFLPlayer mahomes = new OffensivePlayer("Patrick Mahomes", 23, 190.50, 230.0, "QB", 15, 114.8, 516, 346, 4543.0, 45, 55, 238.0, 2, 9, 2, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/MAH401939.png");
    NFLPlayer carr= new OffensivePlayer("Austin Carr", 24, 185.42, 195.0, "WR", 80, 72.0, 0, 9, 97.0, 2, 0, 0.0, 0, 0, 0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/CAR343555.png");
    NFLPlayer bryant= new OffensivePlayer("Dez Bryant", 30, 187.96, 220.0, "WR", 88, 82.0, 0, 69, 838.0, 6, 1, 0.0, 0, 1, 1, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/BRY336027.png");
    //Add defensive players
    NFLPlayer matthews = new DefensivePlayer("Clay Matthews", 32, 190.50, 255.0, "LB", 52, 82.0, 39, 27, 12, 3.5, 0, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/MAT538690.png");
    NFLPlayer jones = new DefensivePlayer("Josh Jones", 24, 187.96, 220.0, "DB", 27, 71.0, 40, 33, 7, 1.0, 1, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/JON506328.png");
    NFLPlayer lancaster = new DefensivePlayer("Tyler Lancaster", 24, 190.50, 313.0, "DT", 95, 70.0, 17, 14, 3, 0.0, 0, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/LAN015019.png");
    NFLPlayer jackson = new DefensivePlayer("Josh Jackson", 22, 182.88, 196.0, "CB", 37, 76.0, 48, 38, 10, 0.0, 8, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/JAC280902.png");
    NFLPlayer lowry = new DefensivePlayer("Dean Lowry", 24, 198.12, 296.0, "DE", 94, 77.0, 35, 25, 10, 3.0, 1, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/LOW617631.png");
    NFLPlayer crawford = new DefensivePlayer("James Crawford", 24, 187.96, 239.0, "LB", 54, 64.0, 7, 7, 0, 0.0, 0, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/CRA664389.png");
    NFLPlayer robinson = new DefensivePlayer("Patrick Robinson", 31, 180.34, 191.0, "DB", 21, 83.0, 6, 5, 1, 0.0, 0, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/ROB671457.png");
    NFLPlayer davenport = new DefensivePlayer("Marcus Davenport", 22, 198.12, 265.0, "DE", 92, 75.0, 16, 10, 6, 4.0, 2, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/DAV004893.png");
    NFLPlayer davison = new DefensivePlayer("Tyeler Davison", 26, 187.96, 309.0, "DT", 95, 80.0, 20, 6, 14, 1.0, 1, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/DAV822084.png");
    NFLPlayer sorensen = new DefensivePlayer("Daneil Sorensen", 28, 187.96, 208.0, "DB", 49, 75.0, 16, 9, 7, 0.0, 1, 0, 0, 0.0, "http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/SOR181831.png");
    
    //Add players to ArrayList
    LIST_OF_PLAYERS.add(brady);
    LIST_OF_PLAYERS.add(edelman);
    LIST_OF_PLAYERS.add(rodgers);
    LIST_OF_PLAYERS.add(kamara);
    LIST_OF_PLAYERS.add(cobb);
    LIST_OF_PLAYERS.add(adams);
    LIST_OF_PLAYERS.add(brees);
    LIST_OF_PLAYERS.add(mahomes);
    LIST_OF_PLAYERS.add(carr);
    LIST_OF_PLAYERS.add(bryant);
    LIST_OF_PLAYERS.add(matthews);
    LIST_OF_PLAYERS.add(jones);
    LIST_OF_PLAYERS.add(lancaster);
    LIST_OF_PLAYERS.add(jackson);
    LIST_OF_PLAYERS.add(lowry);
    LIST_OF_PLAYERS.add(crawford);
    LIST_OF_PLAYERS.add(robinson);
    LIST_OF_PLAYERS.add(davenport);
    LIST_OF_PLAYERS.add(davison);
    LIST_OF_PLAYERS.add(sorensen);
    
  }
  //Overide toString
  @Override
  public String toString(){
    String players = "";
    for (NFLPlayer n: LIST_OF_PLAYERS)
      players += (n.name + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");
    return players;  
  }
}