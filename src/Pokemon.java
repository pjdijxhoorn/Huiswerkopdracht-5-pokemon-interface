public abstract class Pokemon {
    int level;
    int hp;
    String name;
    String type;
    String food;
    String sound;



    // constructor(s) ----------------------------------------------------------------------------------

    public Pokemon(int level, int hp, String name, String type, String food, String sound) {
        this.level = level;
        this.hp = hp;
        this.name = name;
        this.type = type;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon() {

    }


    // gettersNsetters -----------------------------------------------------------------------------

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }



    // methods ----------------------------------------------------------------------------------




}
