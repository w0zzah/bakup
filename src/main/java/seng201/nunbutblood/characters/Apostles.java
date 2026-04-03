package seng201.nunbutblood.characters;
import seng201.nunbutblood.models.Purchasable;

/*

    Last Edited 0331 02/04/26 @author cwi184 - "Added clean to-do list with some simple pseudo code"

        Apostles Abstract Class --- To serve as Player's Characters
          Attributes:
            ~ name (String)
            ~ maxStamina (int) : Required for expedition distance
            ~ currentStamina (int) : Decreases during failure
            ~ perception (int) : Required for finding gold/success
            ~ currentHealth / maxHealth (int)
            ~ hiringCost (int) : Price in Market
            ~ dailyPay (int) : The 'Upkeep' cost per round
         TODO:
          Methods:
            ~ takeDamage(int amount) : Reduces health
            ~ consumeStamina(int amount) : Reduces stamina on failed checks
            ~ isConscious() : Returns true if health > 0
*/

public abstract class Apostles implements Purchasable {

    /*
        The Apostle class serve's as a base for our hero's.
        Apostle's have a name, main stat, stamina, perception, hiring cost and up keep cost
        The name will be randomly generated String
        The main stat will be either Strength, Wisdom or Dexterity
        Perception will be a
    */

    // Names character
    private String name;

    //  Stamina decrease's on failed check
    private int maxStamina;
    private int currentStamina;

    // Base Strength, Wisdom, and Dexterity
    private int strength;
    private int wisdom;
    private int dexterity;

    // Chance of acquiring an Item after combat
    private int perception;

    // The required faith for purchase between 500 and 1000 faith  - >  calculation is ((each stat - 10 / 2) * 25) + 500.
    private int hireCost;

    // The required faith to take Apostle on crusade between -250 and 250 faith -> calculation is (each stat - 10 / 2) * 12
    // A negative upKeep will reward players for using weaker apostle's
    private int upKeep;

    // The type stat to be used for rolling
    private int primaryStat;

    // Keep total of how many crusade's the apostle has been through
    private int crusadeCount;

    // Portrait of Crusader - May not implement, here as placeholder
    private String portrait;
    /**
     * Constructor for Apostle's. To be generated through market which pull's on each respective class
     * for base additions. Market -> Executioner -> Apostle's. Will build this way to so itterate's over
     * game state. Longer game goes on, better stat's for Apostle's in market
     *
     * @param name           Name for Apostle
     * @param stamina        maxStamina and currentStamina for the apostle
     * @param strength       Strength for Apostle, int 0-20 which is modified in class get as (strength - 10 / 2)
     * @param wisdom         Wisdom for Apostle, int 0-20 which is modified in class get as (wisdom - 10 / 2)
     * @param dexterity      Dexterity for Apostle, int 0-20 which is modified in class get as (dexterity - 10 / 2)
     * @param perception     Perception for Apostle, serve's as the chance to find Item's
     * @param hireCost       Cost to hire the Apostle, (500 to 1000 faith) - >  calculation is ((each stat - 10 / 2) * 25) + 500.
     * @param upKeep         Cost per expedition for apostle, (-240 to 240) -> calculation is (each stat - 10 / 2) * 12
     * @param primaryStat    Flat bonus of +5 to be added to roll if true
     * @param portrait       Portrait of the Apostle generated in market
     */
    public Apostles(String name, int stamina, int strength, int wisdom, int dexterity, int perception, int hireCost, int upKeep, int primaryStat, String portrait) {
        this.name = name;
        this.maxStamina = stamina;
        this.currentStamina = stamina;
        this.strength = strength;
        this.wisdom = wisdom;
        this.dexterity = dexterity;
        this.perception = perception;
        this.hireCost = hireCost;
        this.upKeep = upKeep;
        this.primaryStat = primaryStat;
        this.portrait = portrait;
    }
}

