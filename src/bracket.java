public class bracket {
  

  private String homeTeam, awayTeam, date, round;
  private int hometeamscore, awayteamscore;

  public bracket(String round, String homeTeam, String awayTeam,int hometeamscore, int awayteamscore, String date) {
    this.round = round;
    this.homeTeam = homeTeam;
    this.awayTeam = awayTeam;
    this.hometeamscore = hometeamscore;
    this.awayteamscore = awayteamscore;
    this.date = date;
  }

  public String toString(){
    return String.format("%-10s", this.date) + "\t"  +this.homeTeam + ": " + this.hometeamscore + "\t"+ "\t" + this.awayTeam + ": " + this.awayteamscore ;
  }

  public String getHomeTeam(){
    return this.homeTeam;
  }

  public Integer getHomeTeamScore(){
    return this.hometeamscore;
  }

  public String getAwayTeam(){
    return this.awayTeam;

  }

  public Integer getAwayTeamScore(){
    return this.awayteamscore;
  }

  public String getDate(){
    return this.date;
  }

  public String getRound(){
    return this.round;
  }

  public void setHomeTeam(String homeTeam){
    this.homeTeam = homeTeam;
  }

  public void setAwayTeam(String awayTeam){
    this.awayTeam = awayTeam;
  }

  public void setHomeTeamScore(int hometeamscore){
    this.hometeamscore = hometeamscore;
  }

  public void setAwayTeamScore(int awayteamscore){
    this.awayteamscore = awayteamscore;
  }

  public void setDate(String date){
    this.date = date;
  }

  public void setRound(String round){
    this.round = round;
  }
}
