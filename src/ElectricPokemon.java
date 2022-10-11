import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ElectricPokemon extends Pokemon{
    private static final String type = "electric";
    List<String> attacks = Arrays.asList("thunderpunch","electroball","thunder","volttackle");
    Random random = new Random();
    // constructor(s) ----------------------------------------------------------------------------------

    public ElectricPokemon(int level, int hp, String name, String food, String sound) {
        super(level, hp, name, type, food, sound);
    }

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
    }


    // gettersNsetters -----------------------------------------------------------------------------

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }


    // methods ----------------------------------------------------------------------------------

    public void damageCalculator(Pokemon name, Pokemon enemy,int damage){
        switch (enemy.getType()) {
            case "water" -> {
                damage = damage * 4 ;
            }
            case "grass" -> {
                damage = damage * 3;
            }
            case "fire" -> {
                damage = damage * 2;
            }
            case "electric" -> {
                damage = damage;
            }
        }
        Pokemon.printDamageCalculator(name, damage, enemy);
    }




    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunderpunch");
        int damage = random.nextInt(20 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electroball");
        int damage = random.nextInt(30 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
        int damage = random.nextInt(25 + 1) + 1;
        damageCalculator(name, enemy, damage);
        name.setHp(name.getHp()+10);
        System.out.println(name.getName()+ " gets a boost of 10 hp and now has a total hp of " +name.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volttackle");
        int damage = random.nextInt(15 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }


    /*een system.out.println die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
        een beslissingstructuur die kijkt welk type de vijand heeft;
        aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
        een system.out.println die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
        vergeet de hp van de vijand niet te verlagen;
        sluit de methode af met een system.out.println die de resteren hp waarde weergeeft van de vijand;*/
}
