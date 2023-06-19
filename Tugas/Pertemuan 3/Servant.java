public class Servant {
    private String nama, classType;
    private double power, Quartz;
    private int npLevel;


    public Servant() {
    }

    public Servant(String nama, String classType, double power, double Quartz) {
        this.nama = nama;
        this.classType = classType;
        this.power = power;
        this.Quartz = Quartz;
        this.npLevel = 0;
    }

    public void Detail() {
        System.out.println("\n========== Detail ===========");
        System.out.println("Servant Name  : " + this.getNama());
        System.out.println("Class Type    : " + this.getClassType());
        System.out.println("Power         : " + this.getPower());
        System.out.println("NP Level      : " + this.getNpLevel());
        System.out.println("Quartz        : " + this.getQuartz());
    }

    public void gacha(int price) {
        int upgrade = 0;
        if (price > this.Quartz) {
            System.out.println("\nInsufficient Quartz..");
        } else {
            // Sekali multi gacha (10x gacha) mengonsumsi 30 Quartz, untuk mengupgrade NP level diperlukan 2400 Quartz (1x pity (80x gacha))
            int upNPLevel = price/2400;

            /*Setiap 1 NP Level meningkatkan Power sebanyak:
             * Knights (Saber, Archer, Lancer) = 2500
             * Other (Caster, Assassin, Rider, Berserker) = 2000
             * Extra (Avenger, Ruler, Alter Ego, Moon Cancer, Pretender, Foreigner) = 2300
             * Other (Beast, Grand, Shielder) = 3000
             */
            if (classType.equalsIgnoreCase("Saber") || classType.equalsIgnoreCase("Archer") || classType.equalsIgnoreCase("Lancer")) {
                upgrade = 2500;
            } else if (classType.equalsIgnoreCase("Caster") || classType.equalsIgnoreCase("Assassin") || classType.equalsIgnoreCase("Rider") || classType.equalsIgnoreCase("Berserker")) {
                upgrade = 2000;
            } else if (classType.equalsIgnoreCase("Avenger") || classType.equalsIgnoreCase("Ruler") || classType.equalsIgnoreCase("Alter Ego") || classType.equalsIgnoreCase("Moon Cancer") || classType.equalsIgnoreCase("Pretender") || classType.equalsIgnoreCase("Foreigner")) {
                upgrade = 2300;
            } else {
                upgrade = 3000;
            }

            // Menaikkan NP Level dan menghitung Powe baru
            this.setNpLevel(this.getNpLevel() + upNPLevel);
            this.setPower(this.getPower() + (this.getNpLevel()*upgrade));
            // Menghitung sisa Quartz
            this.setQuartz(this.getQuartz() - price + (price % 2400));

            System.out.printf("\nSuccess Upgrading NP Level from %s to Level %d...\n", this.getNama(), upNPLevel);
            System.out.printf("\nQuartz = %.2f \n", this.getQuartz());
        }
    }

    public void battle(Servant enemy) {
        if (this.getPower() > enemy.getPower()) {
            System.out.printf("\nCongratulations! %s Win the Battle..\n", this.getNama());
            this.setQuartz(this.getQuartz() + 30);
        } else if (this.getPower() == enemy.getPower()) {
            System.out.printf("\n%s and %s are too Strong! Battle Tie..\n", this.getNama(), enemy.getNama());
        } else {
            System.out.printf("\nCongratulations! %s Win the Battle..\n", enemy.getNama());
            enemy.setQuartz(enemy.getQuartz() + 30);
        }
    }

    public void setQuartz(double Quartz) {
        this.Quartz = Quartz;
    }

    public double getQuartz() {
        return Quartz;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setNpLevel(int npLevel) {
        this.npLevel = npLevel;
    }

    public int getNpLevel() {
        return npLevel;
    }
}