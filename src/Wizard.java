public class Wizard extends Character{
    /**
     * Subclass of Character Class
     * 
     * This class contains damage and recovery methods
     * 
     * Damage methods:
     *  ire (-40)
     *  jolt (-20)
     *  *mana used = damage points * 2
     * Recovery method:
     *  relive (max)
     * 
     * Compared to Warlock method:
     *  weaker damage spells
     *  better recovery spell
     * 
     * @author APRIL DAGDAGAN
     * @param name
     */
    Wizard(String name){
        super(name);
    }

    //damage spell 1
    public void ire(Character enemyCharacter){
        //damage point of the spell
        int damagePoints = 40;
        //manapoints decreased based from the damagepoints outputed x 2
        super.manaPoints -= damagePoints * 2;
        //prompt
        System.out.println("\n>>>\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Ire");
        System.out.println(enemyCharacter.characterName + " HP decreased (-40)");
        System.out.println(super.characterName + " MP decreased (-80)\n");

        //decreases HP using damageTarget method; displays current numbers using displayDetails method
        //damageTarget and levelup method checks whether HP of target is 0; if 0, game ends
        damageTarget(enemyCharacter, damagePoints);
    }

    //damage spell 2
    public void jolt(Character enemyCharacter){
        int damagePoints = 20;
        super.manaPoints -= damagePoints * 2;
        System.out.println("\n>>>\n" + super.characterName + " attacks " + enemyCharacter.characterName + " with Jolt");
        System.out.println(enemyCharacter.characterName + " HP decreased (-20)");
        System.out.println(super.characterName + " MP decreased (-40)\n");

        damageTarget(enemyCharacter, damagePoints);
    }
    
    //recover spell
    public void relive(){
        //HP and MP regains max
        super.manaPoints = 200;
        super.healthPoints = 100;
        //prompt
        System.out.println("\n---\n" + super.characterName + " used Relive (regains HP and MP)");
        System.out.println(super.characterName + " HP and MP regained\n");
        System.out.println(super.characterName + "\n[" + super.healthPoints + ", " + super.manaPoints + "]");
    }

}
