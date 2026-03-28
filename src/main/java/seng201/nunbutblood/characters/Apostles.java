package seng201.nunbutblood.characters;

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

