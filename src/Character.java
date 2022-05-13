public class Character {
    /**
     * This is a superclass
     * Its properties are inherited by Wizard and Warlock class
     * 
     * Methods in this class includes:
     *  introducing characters and their current numbers (HP & MP);
     *  displaying current numbers each turn;
     *  subtracting HP of the characters each attack; &
     *  displaying who is defeated and who leveled up.
     * 
     * @author APRIL DAGDAGAN
     */

    //declaring properties
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;
    public String type;

    Character(){
        //prompt
        System.out.println("    _______________________________\n");
        System.out.println("              `.,\n" +
        "        `.     -o-      .`  .'\n" +
        "   (!) _) \\_   / `     -o-_/ (_ (!)\n" +
        "        ( /}  /        '|`{\\ \\\n" +
        "        ) \\--/          |_/(  \\\n" +
        "       /___\\            | (__(\n" +
        "       \"'   \"\"              ' '");
        System.out.println("        [WIZARDS AND WARLOCKS]");
        System.out.println("    _______________________________\n"); 
        System.out.println("              starting...\n");
        System.out.println(">>>\nGame Legends: \nCharacter Name\n[Health Points, Mana Points]\n\n"); //example: Izuru [100, 200]
        System.out.println("          players entering...\n");
        System.out.println("               loading...\n\n");

    }

    //initialization of the properties
    Character(String name){
        characterName = name;
        level = 1;
        healthPoints = 100;
        manaPoints = 200;   
    }

    //method to introduce the characters and their numbers
    //takes character type as a parameter to display
    public void displayCharacter(String characterType){
        type = characterType;
        System.out.println(type + " " + characterName + " (lvl. " + level + ") entered the game.");
        System.out.println("[100, 200]");
    }

    //displays health and mana points of both players
    public void displayDetails(Character enemyCharacter){
        System.out.println(characterName + "\n[" + healthPoints + ", " + manaPoints + "]");
        System.out.println(enemyCharacter.characterName + "\n[" + enemyCharacter.healthPoints + ", "  + enemyCharacter.manaPoints + "]");
        
    }

    //method that decreases HP of the target (specific damage decrease by each damage spells)
    //if player reaches >=0 HP, then it is defeated, promt will be printed
    public void damageTarget(Character enemyCharacter,int damagePoints){
        enemyCharacter.healthPoints -= damagePoints;
        //manapoints decreased based from damage points outputed x 2
        manaPoints -= damagePoints * 2;
        //displays details: HP and MP of both characters
        displayDetails(enemyCharacter);

        if(enemyCharacter.healthPoints <= 0){
            System.out.println("\n!!!\nCharacter " + enemyCharacter.characterName + " defeated.");
            levelUp();
            levelUpDetails(enemyCharacter);
        }
    }

    //level increases by 10 for the player that won
    public void levelUp(){
            level += 10;
    }

    //promt after level up
    public void levelUpDetails(Character enemyCharacter){
            System.out.println("\n" + type + " " + characterName + " leveled up (+10)\n");
            System.out.println(enemyCharacter.characterName + " (lvl. " + enemyCharacter.level + ") " + " exited the game\n");
            System.out.println(characterName + " (lvl. " + level + ") " + " exited the game");
    }
}
