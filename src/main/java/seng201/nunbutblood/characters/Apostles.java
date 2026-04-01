package seng201.nunbutblood.characters;

/*

    Last Edited 0331 02/04/26 @author cwi184 - "Added clean to-do list with some simple pseudo code"

        Apostles Abstract Class --- To serve as Player's Characters
        TODO:
          Attributes:
            ~ name (String)
            ~ maxStamina (int) : Required for expedition distance
            ~ currentStamina (int) : Decreases during failure
            ~ perception (int) : Required for finding gold/success
            ~ currentHealth / maxHealth (int)
            ~ hiringCost (int) : Price in Market
            ~ dailyPay (int) : The 'Upkeep' cost per round
          Methods:
            ~ takeDamage(int amount) : Reduces health
            ~ consumeStamina(int amount) : Reduces stamina on failed checks
            ~ isConscious() : Returns true if health > 0
*/

public abstract class Apostles {

    // name -> names character (quick note for later me - add ability to change name?)
    private String name;

    // Base Stats -> Will look to change through gameplay (Health, Stength, Wisdom, Dexterity)
    private int currentHealth;
    private int maxHealth;
    private int strength;
    private int wisdom;
    private int dexterity;
    // rename to str? may change to shorthand -> str, wis, dex


    // Cost + up keep -> wont change through game
    private int baseCost;
    private int upKeep;

    // Constructor
    public Apostles(String name, int currentHealth, int strength, int baseCost, int upKeep) {
        this.name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = currentHealth;
        this.strength = strength;
        this.wisdom = wisdom;
        this.dexterity = dexterity;
        this.baseCost = baseCost;
        this.upKeep = upKeep;
    }
}

