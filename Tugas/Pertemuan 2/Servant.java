public class Servant {
    String name, type, npType, status;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getnpType() {
        return npType;
    }

    public void getStatus() {
        System.out.println("Servant is already summoned");
    }
}


class Stats {
    public static void main(String[] args) {
        Servant svt = new Servant();
        svt.name = "Gilgamesh";
        svt.type = "Archer";
        svt.npType = "Anti-World";
        System.out.printf("Servant Data\nName: %s\nClass Type: %s\nNP Type: %s\n", svt.getName(), svt.getType(), svt.getnpType());
        svt.getStatus();
    }
}