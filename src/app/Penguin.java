package app;

// penguin just eats fishes

public class Penguin extends Tamagotchi {

    private String _food = "fish";

    public Penguin(String name, int age) {
        super(name, age);
    }

    public void set_food (String food) {
        if (food.equals(this._food))
            super.set_hunger();
    }
}