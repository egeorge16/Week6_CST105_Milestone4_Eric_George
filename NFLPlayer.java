 /**Program: NFLPlayer
 * File: NFLPlayer.java
 * Summary: Create an abstact NFL player object with 
 * multiple getters and setters for various
 * player stats.
 * Author: Eric George
 * Date: December 9, 2018
 */
//Import javafx image for image use in final product
import javafx.scene.image.Image;

public abstract class NFLPlayer{
  //Define variables
  public String name;
  public int age;
  public double height;
  public double weight;
  public String position;
  public int playerNumber;
  public double rating;
  //Create Image to use in final program later
  Image photo;
  //Create NFLPlayer with no args
  public NFLPlayer(){
      }
  //Create NFLPlayer with args    
  public NFLPlayer(String name, int age, double height, double weight, String position, int playerNumber, double rating, String url){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.position = position;
    this.playerNumber = playerNumber;
    this.rating = rating;
    this.photo = new Image(url, 60, 60, true, false);
  }
  //Create toString
  public String toString(){
    return name;
  }
  //Create getter for photo
  public Image getPhoto(){
    return photo;
  }
  //Create setting for photo
  public void setImage(String url){
    this.photo = new Image(url, 60, 60, true, false);
  }
  //Create getters and setters for generic player template
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public double getHeight(){
    return height;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public double getWeight(){
    return weight;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public String getPosition(){
    return position;
  }
  public void setPosition(String position){
    this.position = position;
  }
  public int getPlayerNumber(){
    return playerNumber;
  }
  public void setPlayerNumber(int playerNumber){
    this.playerNumber = playerNumber;
  }
public double getRating(){
    return rating;
  }
  public void setRating(double rating){
    this.rating = rating;
  }
}