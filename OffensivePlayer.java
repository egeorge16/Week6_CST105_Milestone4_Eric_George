//Import image for later use
import javafx.scene.image.Image;

public class OffensivePlayer extends NFLPlayer{
  //Declare variables relating to offensive players, 
  public int passingAttempts;
  public int passingCompletions;
  public double passingYards;
  public int passingTouchDowns;
  public int rushingAttempts;
  public double rushingYards;
  public int rushingTouchdowns;
  public int fumbles;
  public int lostFumbles;
  //Create OffensivePlayer with no args
  public OffensivePlayer(){
  }
  //Create OffensivePlayer with args only related to offence variables
  public OffensivePlayer(int passingAttempts, int passingComletions,double passingYards, int passingTouchDowns, double passingYards, int rushingAttempts, double rushingYards, int rushingTouchDowns, int fumbles, int lostFumbles){
    this.passingAttempts = passingAttempts;
    this.passingCompletions = passingCompletions;
    this.passingTouchDowns = passingTouchdowns;
    this.passingYards = passingYards;
    this.rushingAttempts = rushingAttempts;
    this.rushingYards = rushingYards;
    this.rushingTouchDowns = rushingTouchDowns;
    this.fumbles = fumbles;
    this.lostFumbles = lostFumbles;
  }
  //Create OffensivePlayer with args that include the abstract NFLPlayer
  public OffensivePlayer(String name, int age, double height, double weight, String position, int playerNumber, double rating, int passingAttempts, int passingComletions,double passingYards, int passingTouchDowns, double passingYards, int rushingAttempts, double rushingYards, int rushingTouchDowns, int fumbles, int lostFumbles, String url){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.position = position;
    this.playerNumber = player number;
    this.rating = rating;
    this.passingAttempts = passingAttempts;
    this.passingCompletions = passingCompletions;
    this.passingTouchDowns = passingTouchdowns;
    this.passingYards = passingYards;
    this.rushingAttempts = rushingAttempts;
    this.rushingYards = rushingYards;
    this.rushingTouchDowns = rushingTouchDowns;
    this.fumbles = fumbles;
    this.lostFumbles = lostFumbles;
    this.photo = new Image(url, 60, 60, true, false);
  }
  //Override toString
  @Override
  public String toString(){
    return "Offensive Player: " + this.name;
  }
  //Create getters and setters for offensive attributes
  public double getRating(){
    return rating;
  }
  public void setRating(double rating){
    this.rating = rating;
  }
  public int getPassingAttempts(){
    return passingAttempts;
  }
  public void setPassingAttempts(int passingAttempts){
    this.passingAttempts = passingAttempts;
  }
  public int getPassingCompletions(){
    return passingCompletions;
  }
  public void setPassingCompletions(int passingCompletions){
    this.passingCompletions = passingCompletions;
  }
  public int getPassingTouchDowns(){
    return passingTouchDowns;
  }
  public void setPassingTouchDowns(int passingTouchDowns){
    this.passingTouchDowns = passingTouchDowns;
  }
  public double getPassingYards(){
    return passingYards;
  }
  public void setPassingYards(double passingYards){
    this.passingYards = passingYards;
  }
  public int getRushingAttempts(){
    return rushingAttempts;
  }
  public void setRushingAttempts(int rushingAttempts){
    this.rushingAttempts = rushingAttempts;
  }
  public double getRushingYards(){
    return rushingYards;
  }
  public void setRushingYards(double rushingYards){
    this.rushingYards = rushingYards
  }
  public int getRushingTouchDowns(){
    return rushingTouchDowns;
  }
  public void setRushingTouchDowns(int rushingTouchDowns){
    this.rushingTouchDowns = rushingTouchDowns;
  }
  public int getFumbles(){
    return fumbles;
  }
  public void setFumbles(int fumbles){
    this.fumbles = fumbles;
  }
  public int getLostFumbles(){
    return lostFumbles;
  }
  public void setLostFumbles(int lostFumbles){
    this.lostFumbles = lostFumbles;
  }
}
