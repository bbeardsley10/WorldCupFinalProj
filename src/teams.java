public class teams {
<<<<<<< HEAD
    
=======
    private String team, group;
    private int win, draw, loss;

    public teams(String group, String team, int win, int draw, int loss){
        this.team = team;
        this.group = group;
        this.win = win;
        this.draw = draw;
        this.loss= loss;

    }

    public String toString(){
        return "\t" + "\t" + String.format("%-10s",this.team) +"\t" + this.win + "\t" + this.draw + "\t" + this.loss ;
    }

    public String getGroupName() {
        return this.group;
    }

    public String getTeamName(){
        return this.team;
    }

    public int getWins(){
        return this.win;
    }

    public int getDraws(){
        return this.draw;
    }

    public int getLosses(){
        return this.loss;
    }
>>>>>>> 5670a8b25b2a5a9302b4227528ea8abfc399686c
}
