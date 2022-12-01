import java.util.ArrayList;
import java.util.Scanner;

public class worldCup {

    teams team[];
    match matches[];

    public worldCup(){
        team = new teams[32];
        team[0] = new teams("A", "Netherlands", 2, 1, 0);
        team[1] = new teams("A", "Senegal", 2, 0, 1);
        team[2] = new teams("A", "Ecuador", 1  , 1, 1);
        team[3] = new teams ("A", "Qatar", 0, 0, 3);
        team[4] = new teams("B", "England", 2, 1, 0);
        team[5] = new teams("B", "United States", 1, 2, 0);
        team[6] = new teams("B", "Iran", 1, 0, 2);
        team[7] = new teams("B", "Wales", 0, 1, 2);
        team[8] = new teams("C", "Argentina", 2, 0, 1);
        team[9] = new teams("C", "Poland", 1, 1, 1);
        team[10] = new teams("C", "Mexico", 1, 1, 1);
        team[11] = new teams("C", "Saudi Arabia", 1, 0, 2);
        team[12] = new teams("D", "France", 2, 0, 1);
        team[13] = new teams("D", "Australia", 2, 0, 1);
        team[14] = new teams("D", "Tunisia", 1, 1, 1);
        team[15] = new teams("D", "Denmark", 0, 1, 2);
        team[16] = new teams("E", "Spain", 1, 1, 0);
        team[17] = new teams("E", "Japan", 1, 0, 1);
        team[18] = new teams("E", "Costa Rica", 1, 0, 1);
        team[19] = new teams("E", "Germany", 0, 1, 1);
        team[20] = new teams("F", "Morocco", 2, 1, 0);
        team[21] = new teams("F", "Croatia", 1, 2, 0);
        team[22] = new teams("F", "Belgium", 1, 1, 1);
        team[23] = new teams("F", "Canada", 0, 0, 3);
        team[24] = new teams("G", "Brazil", 2, 0, 0);
        team[25] = new teams("G", "Switzerland", 1, 0, 1);
        team[26] = new teams("G", "Cameroon", 0, 1, 1);
        team[27] = new teams("G", "Serbia", 0, 1, 1);
        team[28] = new teams("H", "Portugal", 2, 0, 0);
        team[29] = new teams("H", "Ghana", 1, 0, 1);
        team[30] = new teams("H", "South Korea", 0, 1, 1);
        team[31] = new teams("H", "Uruguay", 0, 1, 1);

        matches = new match[20];

        matches[0] = new match("A", "Qatar", "Ecuador", 0,2, "11-20-2022");
        matches[1] = new match("B", "England", "Iran", 6,2, "11-21-2022");
        matches[2] = new match("A", "Senegal", "Netherlands", 0, 2, "11-21-2022");
        matches[3] = new match("B", "USA","Wales", 1, 1, "11-21-2022");
        matches[4] = new match("C", "Argentina", "Saudi Arabia", 1, 2, "11-22-2022");
        matches[5] = new match("D", "Denmark", "Tunisia", 0, 0, "11-22-2022");
        matches[6] = new match("C", "Mexico", "Poland", 0, 0, "11-22-2022");
        matches[7] = new match("D", "France", "Australia", 4, 1, "11-22-2022");
        matches[8] = new match("F", "Morocco", "Croatia", 0, 0, "11-23-2022");
        matches[9] = new match("E", "Germany", "Japan", 1, 2, "11-23-2022");
        matches[10] = new match("E", "Spain", "Costa Rica", 7, 0, "11-23-2022");
        matches[11] = new match("F", "Belgium", "Canada", 1, 0, "11-23-2022");
        matches[12] = new match("G", "Switzerland", "Cameroon", 1, 0, "11-24-2022");
        matches[13] = new match("H", "Uruguay", "South Korea", 0, 0, "11-24-2022");
        matches[14] = new match("H", "Portugal", "Ghana", 3, 2, "11-24-2022");
        matches[15] = new match("G", "Brazil", "Serbia", 2, 0, "11-24-2022");
        matches[16] = new match("B", "Wales", "Iran", 0, 2, "11-25-2022");
        matches[17] = new match("A", "Qatar", "Senegal", 1, 3, "11-25-2022");
        matches[18] = new match("A", "Netherlands", "Ecuador", 1, 1, "11-25-2022");
        matches[19] = new match("B", "England", "USA", 0, 0, "11-25-2022");

        Scanner input = new Scanner(System.in);
        int option;
        while(true){
            menu();
            System.out.print("Select An Option: ");
            option = input.nextInt();
            if(option == 4){
                break;
            }
            switch(option){
                case 1 : 
                getGroupStandings();
                break;
                case 2 :
                getMatchResults();
                break;
            }
        }
        input.close();
    }
    
    public void menu(){
        System.out.println("\n------------------------------------");
        System.out.println("Welcome to the 2022 World Cup Stats");
        System.out.println("------------------------------------");
        System.out.println("Option 1 - View Group Standings");
        System.out.println("Option 2 - View Game Results");
        System.out.println("Option 3 - View Playoff Results");
        System.out.println("Option 4 - Quit");
        
    }
    
    public void getGroupStandings(){
        System.out.println("\nCurrent Standings");
        System.out.println("---------------------------------------------------------");
        System.out.println("\nGroup A:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int j = 0; j< team.length; j++){
            if(team[j].getGroupName() == "A"){
                System.out.println(team[j]);
            }
        }
        System.out.println("\nGroup B:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "B"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup C:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "C"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup D:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "D"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup E:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "E"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup F:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "F"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup G:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "G"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("\nGroup H:" + "\t" + "Country:" + "\t" + "Wins:" + "\t"+ "Draws:" + "\t" + "Losses:" );
        for(int i = 0; i< team.length; i++){
            if(team[i].getGroupName() == "H"){
                
                System.out.println(team[i]);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public void getMatchResults(){
        
        System.out.println("\nMatch Results");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\nGroup :" + "\t" + "  Home:" + "\t"  + "\t"+ "\t" + "Away:" + "\t" + "\t" +"\t" + "Date:" );
        for(int j = 0; j< matches.length; j++){
            System.out.println(matches[j]);
        }
    }

    public static void main(String[] args) {
        new worldCup();
    }   
    
}
