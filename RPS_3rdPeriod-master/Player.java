

public interface Player
{
    /**
     * Ask for and return a string
     */
    public String choose();
    
    /**
     * Ask for player name if cpu = false.
     * If cpu = true, return "CPU"
     */
    public String setName(boolean cpu);
}
