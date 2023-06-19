abstract class Character {
    private String name;

    public Character (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);
}

class Fighter extends Character {
    private int attackPower;

    public Fighter (String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    private int attackPower;

    public Mage (String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("frost")) {
            return attackPower * 2;
        } else if (attackType.equals("fire")) {
            return attackPower * 3;
        } else {
            return 0;
        }
    }

}

public class No1 {
    public static void printAttack(Character character) {
        System.out.printf("%s attacks with power %d\n", character.getName(), character.attack("melee"));
    }
    
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        
        characters[0] = new Fighter("Alu", 2000);
        characters[1] = new Mage("Selena", 1800);
        characters[2] = new Fighter("Freya", 2500);
        characters[3] = new Fighter("Arlott", 1700);
        characters[4] = new Mage("Kagura", 2100);

        for (Character character : characters) {
            printAttack(character);
        }
    }
}