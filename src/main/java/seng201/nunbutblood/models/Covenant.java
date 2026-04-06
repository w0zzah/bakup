package seng201.nunbutblood.models;
/*

Last Edited 0349 02/04/26 @author cwi184 - "Covenant Class --- Main hub to serve as Players 'home-base'"

        Covenant Class --- Management of Party and Resources
        TODO:
          Attributes:
            ~ name (String) : Name of the players covenant
            ~ faith (int) : Currency (Gold equivalent)
            ~ totalCrusades (int) : Progress tracker
            ~ currentCrusade (int) : Goal (5-15)
            ~ activeParty (ArrayList) : Max 5
            ~ reserves (ArrayList) : Max 5
            ~ inventory (ArrayList) : Items/Objects
            - totalFaithEarned : int
            - score: int
          Methods:
            GETTERS
            + getName(): String
            + getFaith(): int
            +getTotalCrusades(): int
            + getCurrentCrusade(): int
            + getRemainingCrusades(): int
            + getActiveParty(): LIst
            + getReserves(): LIst
            + getInventory(): List
            + getTotalFaithEarned(): int
            + getScore(): int
            FUNCTIONS
            + addApostle(): bool
            + benchApostle(): bool
            + activateApostle(): bool
            + retireApostle(): bool
            + addFaith(): int
            + spendFaith(): int
            + payActiveParty(): int
            + addItem(Item item):
            + removeItem(Item item): bool
            + addScore(int points):
            + advanceCrusade():
            + isGameComplete(): bool
            + hasLost(): bool

 */