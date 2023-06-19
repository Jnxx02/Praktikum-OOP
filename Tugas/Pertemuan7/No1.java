abstract class Character {
    private String name;

    public Character (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(Type attackType);
    abstract Type getAttackType();
}

class Fighter extends Character {
    private int attackPower;
    private Type attackType;

    public Type getAttackType() {
        return attackType;
    }

    public Fighter (String name, int attackPower, Type attackType) {
        super(name);
        this.attackPower = attackPower;
        this.attackType = attackType;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(Type attackType) {
        if (attackType.equals(Type.melee)) {
            return attackPower * 2;
        } else if (attackType.equals(Type.ranged)) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    private int attackPower;
    private Type attackType;

    public Type getAttackType() {
        return attackType;
    }

    public Mage (String name, int attackPower, Type attackType) {
        super(name);
        this.attackPower = attackPower;
        this.attackType = attackType;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(Type attackType) {
        if (attackType.equals(Type.frost)) {
            return attackPower * 2;
        } else if (attackType.equals(Type.fire)) {
            return attackPower * 3;
        } else {
            return 0;
        }
    }

}

enum Type {
    melee,
    ranged,
    fire,
    frost
}

public class No1 {
    public static void printAttack(Character character) {
        System.out.printf("%s attacks with power %d\n", character.getName(), character.attack(character.getAttackType()));
    }
    
    public static void main(String[] args) {
        Character[] characters = new Character[5];

        characters[0] = new Fighter("Alu", 2000, Type.melee);
        characters[1] = new Mage("Selena", 1800, Type.frost);
        characters[2] = new Fighter("Freya", 2500, Type.melee);
        characters[3] = new Fighter("Arlott", 1700, Type.ranged);
        characters[4] = new Mage("Kagura", 2100, Type.fire);

        for (Character character : characters) {
            printAttack(character);
        }
    }
}