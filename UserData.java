public class UserData {

  /*
   * These are the instance variables declared that will be used for the arrays
   * that we will need.
   */
  private String players;
  private String teams;
  private String position;
  private double assists;
  private double points;

  /*
   * This is a constructor method that initializes the
   * instance variables.
   */
  public UserData(String players, String teams, String position, double points) {
    this.players = players;
    this.teams = teams;
    this.position = position;
    this.points = points;
  }

  /*
   * All of these are geter methods which return the values of the 
   * different instance variables that were initialized.
   */
  public String getPlayers(){
    return players;
  }
  public String getTeams(){
    return teams;
  }
  public String getPosition(){
    return position;
  }
  public double getPoints(){
    return points;
  }

  public String toString() {
    return "Players: " + players + "\n" + "Teams: " + teams + "\n" + "Position: " + position + "\n" + "Avg Points: " + points;
  }

} 