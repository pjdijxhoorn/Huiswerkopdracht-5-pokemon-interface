import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{

    String name;/*""*/
    List<Pokemon> pokemons;

    Pokemon charizard = new FirePokemon(100,100,  "brocks charizard","souls of the fallen ones","charizard");/*🔥*/
    Pokemon blastoise = new WaterPokemon(100,100,"brocks blastoise","seaweed","blastioooose");/*🌊*/
    Pokemon venusaur = new GrassPokemon(100,100,"brocks venusaur","sunlight","this creature is to stupid to make a sound");/*🌿*/
    Pokemon ditto = new GrassPokemon(100,100,"brocks ditto","pokebrocks", "dito dito");/*🌿*/
    Pokemon raichu = new ElectricPokemon(100,100,"brocks raichu","cheese","raichu");/*⚡*/
    Pokemon gyarados = new WaterPokemon(100,100,"brocks gyrados","icecream", "gyrados");/*🌊*/

    // constructor(s) ----------------------------------------------------------------------------------
    public PokemonGymOwner(String name) {
        this.name = name;
    }


    // gettersNsetters -----------------------------------------------------------------------------

    public String getPoketrainer(){
        return name;
    };
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public Pokemon getGyarados() { return gyarados;
    }
    public Pokemon getCharizard() {
        return charizard;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public Pokemon getRaichu() {
        return raichu;
    }

    public Pokemon getVenusaur() {
        return venusaur;
    }
}
