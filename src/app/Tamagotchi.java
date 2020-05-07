/*
All tamagotchis have:
    - Attributes:
        - name, age, hunger (status bar 0 to 100), health (Barra de Status bar 0 to 100).
    - Methods:
        - Set name, hunger, health and age;
        - Get name, hunger, health and age
*/

package app;

public class Tamagotchi {
    private String _name;
    private int _age, _hunger = 100, _health;

    public Tamagotchi(String name, int age) {
        this._name = name;
        this._age = age;
    }

    public String get_name() { return _name; }
    public void set_name(String name) { this._name = name; }

    public String get_health() { return String.format("%s health rate is at %d", this._name, this._health); }
    protected void set_health() {
        this._health += 100;
    }

    public String get_hunger() { return String.format("%s hungry rate is at %d", this._name, this._hunger); }
    protected void set_hunger() {
        this._hunger -= 70; // when is correctly feed the hunger decreases
        this.set_health(); // and health increases
    }

    public void set_age(int age) { this._age = age; }
    public int get_age() { return _age; }
}