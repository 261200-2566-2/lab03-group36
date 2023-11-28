
public abstract class Equipment {
    private String name;
    protected double stat;
    protected int level;

    public Equipment(String name, double stat) {
        this.name = name;
        this.level = 1;
        this.stat = stat;
        System.out.println(name + " was created!!");
    }

    public Equipment() {
        this("hand", 0);
    }

    public String getName() {
        return name;
    }

    public double getStat() {
        System.out.println("stat = " + stat);
        return stat;
    }

    public void getCalculatedStat() {
        System.out.println("new stat = " + levelUpCalculate());
    }

    public void levelUp() {
        this.level++;
        if (this.level > 50) this.level = 50; // max level of equipment is 50.
        levelUpCalculate();
        System.out.println(name + " Level up to " + level + "!!");
    }

    public abstract double levelUpCalculate();
}


class Sword extends Equipment {
    public Sword(String name, double damage) {
        super(name, damage);
    }

    public Sword() {
        super();
    }

    public double levelUpCalculate() {
        return stat * (1 + 0.1 * level);
    }
}


class Shield extends Equipment {
    public Shield(String name, double defense) {
        super(name, defense);
    }

    public Shield() {
        super();
    }
    public double levelUpCalculate() {
        return stat * (1 + 0.05 * level);
    }
}