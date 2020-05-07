package app;
 
/*
- Create a pet (penguin ou bear);
- Give him a name;
- Feed him; and,
- Verify your health.
*/

public class App {
    public static void main(String[] args) throws Exception {
        Penguin penguin = new Penguin("Pingu", 80);
        System.out.println(penguin.get_hunger());
        penguin.set_food("fish");
        System.out.println(penguin.get_hunger());
        System.out.println(penguin.get_health());
    }
}