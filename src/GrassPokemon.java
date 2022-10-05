import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";
    List<String> attacks = Arrays.asList("leafstorm","solarbeam","leechseed","leaveblade");
    Random random = new Random();

    // constructor(s) ----------------------------------------------------------------------------------

    public GrassPokemon(int level, int hp, String name, String food, String sound) {
        super(level, hp, name, type, food, sound);
    }

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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
            case "electric" -> {
                damage = damage * 4 ;
            }
            case "fire" -> {
                damage = damage * 3 ;
            }
            case "water" -> {
                damage = damage * 2;
            }
            case "grass" -> {
                damage = damage;
            }
        }
        System.out.println(enemy.getName() +" loses "+ damage + " HP");
        int newHP = enemy.getHp()-damage;
        enemy.setHp(newHP);
        System.out.println(enemy.getName()+ " has " +enemy.getHp() +" HP left");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leafstorm");
        int damage = random.nextInt(20 + 1) + 1;
        damageCalculator(name, enemy, damage);

    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solarbeam");
        int damage = random.nextInt(25 + 1) + 1;
        damageCalculator(name, enemy, damage);

    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leechseed");
        int damage = random.nextInt(30 + 1) + 1;
        switch (enemy.getType()) {
            case "electric" -> {
                damage = damage * 4 ;
            }
            case "fire" -> {
                damage = damage * 3 ;
            }
            case "water" -> {
                damage = damage * 2;
            }
            case "grass" -> {
                damage = damage;
            }
        }
        System.out.println(enemy.getName() +" loses "+ damage + " HP");
        int newHP = enemy.getHp()-damage;
        enemy.setHp(newHP);
        name.setHp(name.getHp()+damage);
        System.out.println(enemy.getName()+ " has " +enemy.getHp() +" HP left");
        System.out.println(name.getName()+ " has gained "+ damage +" hp now has " +name.getHp() +" HP");
        if (enemy.getHp()<0)
            System.out.println(enemy.getName()+ " has fainted");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaveblade");
        int damage = random.nextInt(10 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }

    /*een system.out.println die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
        een beslissingstructuur die kijkt welk type de vijand heeft;
        aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
        een system.out.println die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
        vergeet de hp van de vijand niet te verlagen;
        sluit de methode af met een system.out.println die de resteren hp waarde weergeeft van de vijand;*/

}
