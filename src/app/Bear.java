package app;

// bear just eats honey

public class Bear extends Tamagotchi {

    private String _food = "honey";

    public Bear(String name, int age) {
        super(name, age);
    }
    
    public void set_food (String food) {
        if (food.equals(this._food))
            super.set_hunger();
    }
}