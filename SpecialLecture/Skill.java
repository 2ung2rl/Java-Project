class Skill {
    private String name;
    private int power;

    public Skill(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}

class Tackle extends Skill {

    public Tackle() {
        super("몸통박치기", 20);
    }
}

class Fly extends Skill {

    public Fly() {
        super("공중날기", 30);
    }
}

class Surf extends Skill {

    public Surf() {
        super("파도타기", 40);
    }
}