
public class OffsidePosition {
	boolean offsidePosition(int[][] teams) {		
		int team1[] = teams[0];
		int team2[] = teams[1];	
		
		for(int x=0;x<team1.length;x++){
			if (isOffside(team1[x], 1, team2)){
				return true;
			}
		}
		
		for(int x=0;x<team2.length;x++){
			if (isOffside(team2[x], 2, team1)){
				return true;
			}
		}
		
        return false;
	}

	/**
	 * 
	 * @param x player position
	 * @param i team number (1,2) of player
	 * @param team the opposite team
	 * @return true if player at position x is in off-side position for team
	 */
	private boolean isOffside(int x, int i, int[] team) {
		int playersAhead = 0;
		for (int j = 0; j < team.length; j++) {
			int y = team[j];
			if (i == 1) {
				if (y >= x) {
					playersAhead++;
				}
			} else {
				if (y <= x) {
					playersAhead++;
				}
			}
		}
		
		return playersAhead < 2;
	}
			
}
