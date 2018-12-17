//Import image for later use
import javafx.scene.image.Image;

public class DefensivePlayer extends NFLPlayer{
  //Create varibles minus rating because Defensive players don't have ratings listed
  int combinedTackles;
  int totalTackles;
  int assistedTackles;
  double sacks;
  int passesDefended;
  int interceptions;
  int interceptionTouchDowns;
  double interceptionYards;
  
  //Create DefensivePlayer with no args
  public DefensivePlayer(){
  }
  //Create DefensivePlayer with args only relating to defense
  public DefensivePlayer(int combinedTackles, int totalTackles, int assistedTackles, double sacks, int passesDefended, int interceptions, int interceptionTouchDowns, double interceptionYards){
    this.combinedTackles = combinedTackles;
    this.totalTackles = totalTackles;
    this.assistedTackles = assistedTackles;
    this.sacks = sacks;
    this.passesDefended = passesDefended;
    this.interceptions = interceptions;
    this.interceptionTouchDowns = interceptionTouchDowns;
    this.interceptionYards = interceptionYards;
  }
  //Create DefensivePlayer with args including NFLPlayer stats.
  public DefensivePlayer(String name, int age, double height, double weight,String position, int playerNumber, double rating, int combinedTackles, int totalTackles, int assistedTackles, double sacks, int passesDefended, int interceptions, int interceptionTouchDowns, double interceptionYards, String url){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.position = position;
    this.playerNumber = playerNumber;
    this.rating = rating;
    this.combinedTackles = combinedTackles;
    this.totalTackles = totalTackles;
    this.assistedTackles = assistedTackles;
    this.sacks = sacks;
    this.passesDefended = passesDefended;
    this.interceptions = interceptions;
    this.interceptionTouchDowns = interceptionTouchDowns;
    this.interceptionYards = interceptionYards;
    this.photo = new Image(url, 60, 60, true, false);
  }
  //Override toString
  @Override
  public String toString(){
    return "Defensive Player: " + this.name;
  }
  //Set defensive getters and setters
  public int getCombinedTackles(){
    return combinedTackles;
  }
  public void setCombinedTackles(int combinedTackles){
    this.combinedTackles = combinedTackles;
  }
  public int getTotalTackles(){
    return totalTackles;
  }
  public void setTotalTackles(int totalTackles){
    this.totalTackles = totalTackles;
  }
  public int getAssistedTackles(){
    return assistedTackles;
  }
  public void setAssistedTackles(int assistedTackles){
    this.assistedTackles = assistedTackles;
  }
  public double getSacks(){
    return sacks;
  }
  public void setSacks(double sacks){
    this.sacks = sacks;
  }
  public int getPassesDefended(){
    return passesDefended;
  }
  public void setPassesDefended(){
    this.passesDefended = passesDefended;
  }
  public int getInterceptions(){
    return interceptions;
  }
  public void setInterceptions(int interceptions){
    this.interceptions = interceptions;
  }
  public int getInterceptionTouchDowns(){
    return interceptionTouchDowns;
  }
  public void setInterceptionTouchDowns(int interceptionTouchDowns){
    this.interceptionTouchDowns = interceptionTouchDowns;
  }
  public int getInterceptionYards(){
    return interceptionYards;
  }
  public void setInterceptionYards(int interceptionYards){
    this.interceptionYards = interceptionYards;
  }
}