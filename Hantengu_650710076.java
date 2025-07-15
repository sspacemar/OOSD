class Demon {
    String name;
    int powerLevel;

    public Demon(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public void attack() {
        System.out.println(name + " attacks with a special attack.");
    }
}

//Main
class HantenguMain extends Demon {
    public HantenguMain() {
        super("Hantengu Main", 10);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with Blood Demon Magic");
    }
}

//Angry
class HantenguAngry extends Demon {
    public HantenguAngry() {
        super("Hantengu Angry", 30);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with creating lightning strikes at enemies.");
    }
}

//Enjoy
class HantenguEnjoy extends Demon {
    public HantenguEnjoy() {
        super("Hantengu Enjoy", 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with creating powerful winds and storms from weapons.");
    }
}

//Bemoan
class HantenguBemoan extends Demon {
    public HantenguBemoan() {
        super("Hantengu Bemoan", 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with the spear creates a long-range attack wave.");
    }
}

//Pleased
class HantenguPleased extends Demon {
    public HantenguPleased() {
        super("Hantengu Pleased", 20);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with creating intense sound waves.");
    }
}

//Hate
class HantenguHate extends Demon {
    public HantenguHate() {
        super("Hantengu Hate", 100);
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with every power of the 5 bodies in a form that has become exponentially stronger.");
    }
}



public class Hantengu_650710076 {
    public static void main(String[] args) {
        Demon[] hantenguBodies = new Demon[6];
        hantenguBodies[0] = new HantenguMain();
        hantenguBodies[1] = new HantenguAngry();
        hantenguBodies[2] = new HantenguEnjoy();
        hantenguBodies[3] = new HantenguBemoan();
        hantenguBodies[4] = new HantenguPleased();
        hantenguBodies[5] = new HantenguHate();
        
        for (Demon form : hantenguBodies) {
            form.attack();
        }
    }
}
