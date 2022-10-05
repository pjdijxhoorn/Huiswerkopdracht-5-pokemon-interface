import java.util.List;

public class PokemonTrainer {
    String name;/*""*/
    List<Pokemon> pokemons;

    Pokemon charizard = new FirePokemon(100,100,"charizard","souls of the fallen ones","charizard");/*🔥*/
    Pokemon blastoise = new WaterPokemon(100,100,"blastoise","seaweed","blastioooose");/*🌊*/
    Pokemon venusaur = new GrassPokemon(100,100,"venusaur","sunlight","this creature is to stupid to make a sound");/*🌿*/
    Pokemon ditto = new GrassPokemon(100,100,"ditto","pokebrocks", "dito dito");/*🌿*/
    Pokemon raichu = new ElectricPokemon(100,100,"raichu","cheese","raichu");/*⚡*/
    Pokemon gyarados = new WaterPokemon(100,100,"gyrados","icecream", "gyrados");/*🌊*/

    // constructor(s) ----------------------------------------------------------------------------------

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public PokemonTrainer() {
    }


    // gettersNsetters -----------------------------------------------------------------------------

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


    // methods ----------------------------------------------------------------------------------





}
