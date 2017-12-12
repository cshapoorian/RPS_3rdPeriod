import java.util.Scanner;

public interface Game
{
    Scanner scan = new Scanner(System.in);
    /**
     * Return 1 if p1 wins, -1 if p2 wins 0 if tie
     */
    public int win(Player p1, Player p2);
    
    /**
     * Players will make choices, evaluate choices & update score
     */
    public void play(Player p1, Player p2);
    
    /**
     * Ask if player wants to continue, return boolean response
     */
    public boolean end();
    
    /**
     * Updates the score of the player p based on win.
     */
    public double score(Player p);
}
