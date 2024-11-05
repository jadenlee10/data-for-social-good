import java.util.Scanner;

public class UserStory {
  /*
   * We are creating an instance variable that creates the UserData class again
   * which holds all of the values of the instance variables.
   */
  private UserData[] user;

  public UserStory(String playersFile, String teamsFile, String positionFile, String pointsFile){
    user = createUser(playersFile, teamsFile, positionFile, pointsFile);
  }

  /*
   * This method reads all of the different files created that holds all of the data
   * and sets the values for these variables.
   */
  public UserData[] createUser(String playersFile, String teamsFile, String positionFile, String pointsFile) {
    String[] players = FileReader.toStringArray(playersFile);
    String[] teams = FileReader.toStringArray(teamsFile);
    String[] position = FileReader.toStringArray(positionFile);
    double[] points = FileReader.toDoubleArray(pointsFile);
    
    UserData[] tempUser = new UserData[players.length];

    for (int i = 0; i < tempUser.length; i++){
      tempUser[i] = new UserData(players[i], teams[i], position[i], points[i]);
    }
    return tempUser;
  }

  /*
   * This method is the method that interacts with the user by using the scanner class
   * This asks the user to type in the name of the player and if found, will return the variable j which
   * has the values of show stats which is another method.
   */
public String givePlayers() {
   
    Scanner input = new Scanner(System.in);
    System.out.println("Type In The Player: ");
    String playerInput = input.nextLine();
    String j = showStats(playerInput);
    input.close();
    
    return j;
  }

  /*
   * The method showStats determines if the player inputted into the console is equal to the getPlayers method
   * or in other words, it checks to see if the player inputted is in the text class. If it does, then it returns 
   * more data about the player.
   */
public String showStats(String player) {
  String ret = "";
  for(int i = 0; i < user.length; i++){
    if(player.equals(user[i].getPlayers())){
      System.out.println(user[i]);
      ret+= user[i] + "\n";
    }
  }
  return ret;
  }


  public String toString (){
    return "";
  }
}







