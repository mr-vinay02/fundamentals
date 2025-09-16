package scenariobasedproblems;

import java.util.Arrays;

public class TeamAssignmentGame {

    public static void main(String[] args) {

        int[] teamSkilledPlayers = {40,30,10,20};


        Arrays.sort(teamSkilledPlayers);
        int[] teamA = new  int[teamSkilledPlayers.length/2];
        int[] teamB = new  int[teamSkilledPlayers.length/2];

        int index =0;
        for (int i = 0; i < teamA.length; i++) {
            teamA[i] = teamSkilledPlayers[index++];
            teamB[i] = teamSkilledPlayers[index++];
        }


        System.out.println(Arrays.toString(teamA) );
        System.out.println(Arrays.toString(teamB) );

    }
}
