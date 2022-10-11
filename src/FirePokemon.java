import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class FirePokemon extends Pokemon{
    List<String> attacks = Arrays.asList("firelash","flamethrower","pyroball","inferno");

    Random random = new Random();
    private static final String type = "fire";

    // constructor(s) ----------------------------------------------------------------------------------

    public FirePokemon(int level, int hp, String name, String food, String sound) {
        super(level, hp, name, type, food, sound);
    }

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super();
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
        case "grass" -> {
            damage = damage * 4 ;
        }
        case "water" -> {
            damage = damage * 3 ;
        }
        case "electric" -> {
            damage = damage * 2;
        }
        case "fire" -> {
            damage = damage;
        }
    }
    Pokemon.printDamageCalculator(name, damage, enemy);

}

    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with firelash");
        int damage = random.nextInt(20 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flamethrower");
        int damage = random.nextInt(30 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyroball");
        int damage = random.nextInt(35 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
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
