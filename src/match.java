public class match {
    
    private String homeTeam, awayTeam, group, date;
    private int hometeamscore, awayteamscore;

    public match(String group, String homeTeam, String awayTeam, int hometeamscore, int awayteamscore, String date){
        this.group = group;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.hometeamscore = hometeamscore;
        this.awayteamscore = awayteamscore;
        this.date = date;
    }

    public String toString(){
        return String.format("%-10s",this.group) + this.homeTeam + ": " + this.hometeamscore + "\t"+ "\t"  + this.awayTeam + ": " + this.awayteamscore +"\t"+"\t"   + this.date; 
    }
    public String getGroupName() {
        return this.group;
    }

    public String gethomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam(){
        return this.awayTeam;
    }

    public int getHomeTeamScore(){
        return this.hometeamscore;
    }

    public int getAwayTeamScore(){
        return this.awayteamscore;
    }
    public String getDate(){
        return this.date;
    }
}
