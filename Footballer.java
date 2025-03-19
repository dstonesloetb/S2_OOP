public class Footballer
{
  //instance variables
  private String name;
  private int goalsScored;
  private int pointsScored;

  //Constructor
  public Footballer(String name, int goalsScored, int pointsScored) {
    this.name = name;
    this.goalsScored = goalsScored;
    this.pointsScored = pointsScored;
  }
  
  //Setter and getter methods
  public String getName() {
	 return name;
  }
  
  public void setName(String name) {
	 this.name = name;
  }
  
  public int getGoalsScored() {
	 return goalsScored;
  }
  
  public void setGoalsScored(int goalsScored) {
	 this.goalsScored = goalsScored;
  }
  
  public int getPointsScored() {
	 return pointsScored;
  }
  
  public void setPointsScored(int pointsScored) {
	 this.pointsScored = pointsScored;
  }

  //toString method
  public String toString() {
      return "Footballer [name=" + name + ", goalsScored=" + goalsScored + ", pointsScored=" + pointsScored + "]";
  }
  
  //Additional method
  public int totalPoints() {
    return goalsScored * 3 + pointsScored;
  }

    
}  //end class
