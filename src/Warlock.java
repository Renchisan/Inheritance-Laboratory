public class Warlock extends Character{
    /**
     * Subclass of Character class
     * 
     * This class contains damage and recovery methods
     * 
     * Damage methods:
     *  UWU (-70)
     *  nyan! (-25)
     *  *mana used = damage points * 2
     * Recovery method:
     *  heal (+20 HP, +140 MP)
     * 
     * Compared to Wizard Class:
     *  stronger damage spells
     *  weaker recovery spell
     * 
     * @author APRIL DAGDAGAN
     * @param name
     */
    Warlock(String name){
        super(name);
        
    }
    //damage spells
    public void uwu(Character enemyCharacter){
        //damage points of the spell
        int damagePoints = 70;
        //manapoints decreased based on the damagepoints outputed x 2
        super.manaPoints -= damagePoints * 2;
        //prompt
        System.out.println("\n>>>\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with UWU");
        System.out.println(enemyCharacter.characterName + " HP decreased (-70)");
        System.out.println(super.characterName + " MP decreased (-140)\n");
        
        //decreases HP using damageTarget method; displays current numbers using displayDetails method
        //damageTarget and levelup method checks whether HP of target is 0; if 0, game ends
        damageTarget(enemyCharacter, damagePoints);
    };  
    public void nyan(Character enemyCharacter){
        int damagePoints = 25;
        super.manaPoints -= damagePoints * 2;
        System.out.println("\n>>>\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Nyan!");
        System.out.println(enemyCharacter.characterName + " HP decreased (-25)");
        System.out.println(super.characterName + " MP decreased (-50)\n");
        damageTarget(enemyCharacter, damagePoints);
    };

    //recovery spell
    public void heal(){
        //increases HP by 20, increases MP by 140
        super.healthPoints += 20;
        super.manaPoints += 140;
        //prompt
        System.out.println("\n---\n" + super.characterName + " used Heal (+20 HP, +140 MP)");
        System.out.println(super.characterName + " HP increased (+20)");
        System.out.println(super.characterName + " MP increased (+140)\n");
        System.out.println(super.characterName + "\n[" + super.healthPoints + ", " + super.manaPoints + "]");
    }
}

