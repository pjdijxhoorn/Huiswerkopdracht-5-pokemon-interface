import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WaterPokemon extends Pokemon{
    private static final String type = "water";
    List<String> attacks = Arrays.asList("surf","hydropump","hydrocanon","raindance");
    Random random = new Random();
    // constructor(s) ----------------------------------------------------------------------------------
    public WaterPokemon(int level, int hp, String name, String food, String sound) {
        super(level, hp, name, type, food, sound);
    }

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
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
            case "fire" -> {
                damage = damage * 4 ;
            }
            case "electric" -> {
                damage = damage * 3 ;
            }
            case "grass" -> {
                damage = damage * 2;
            }
            case "water" -> {
                damage = damage;
            }
        }
        Pokemon.printDamageCalculator(name, damage, enemy);
    }
    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        int damage = random.nextInt(25 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydropump");
        int damage = random.nextInt(15 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydrocanon");
        int damage = random.nextInt(20 + 1) + 1;
        damageCalculator(name, enemy, damage);
    }
    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with raindance");
        if (enemy.getType().equals("electric")){
            System.out.println("raindance has no effect on " + enemy.getName());
        }else if(enemy.getType().equals("grass")){
            enemy.setHp(getHp()+10);
            System.out.println("raindance gives a hp boost to "+ enemy.getName()+ " of 10hp");
            int damage = random.nextInt(30 + 1) + 1;
            damageCalculator(name, enemy, damage);
        }else{
        int damage = random.nextInt(30 + 1) + 1;
        damageCalculator(name, enemy, damage);}
    }


    /*een system.out.println die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
        een beslissingstructuur die kijkt welk type de vijand heeft;
        aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
        een system.out.println die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
        vergeet de hp van de vijand niet te verlagen;
        sluit de methode af met een system.out.println die de resteren hp waarde weergeeft van de vijand;*/


}
