public class Main {
    public static void main(String[] args) {
        Charmander charmander = new Charmander(5);
        charmander.addSkill(new Tackle());

        Squirtle squirtle = new Squirtle(5);
        squirtle.addSkill(new Tackle());

        squirtle.useSkill(charmander);
    }
}