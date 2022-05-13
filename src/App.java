public class App {
    /**
     * This program prints sequence of each character created 
     * casting cpells until one of the Characters Created gets defeated.
     * 
     * This program uses methods from Wizard, Warlord, and Character class
     * 
     * @author APRIL DAGDAGAN
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
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

        //making characters
        Wizard Merlin = new Wizard("Izuru");
        Warlock Saruman = new Warlock("Astel");
        

        //introducing characters
        Merlin.displayCharacter("Wizard");
        Saruman.displayCharacter("Warlock");

        //prompt
        System.out.println("    _______________________________\n");
        System.out.println("         Wizards and Warlocks\n            " + Merlin.characterName + " VS " + Saruman.characterName);
        System.out.println("    _______________________________");

        //using methods from wizard and warlock classes
        Merlin.ire(Saruman);
        Saruman.uwu(Merlin);
        Merlin.jolt(Saruman);
        Saruman.nyan(Merlin);
        Merlin.relive();
        Saruman.heal();
        Merlin.ire(Saruman);
        Saruman.uwu(Merlin);
        Merlin.jolt(Saruman);
        
    }
}
