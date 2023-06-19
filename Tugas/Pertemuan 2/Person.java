public class Person {
    String name, gender;
    int age;
    boolean isMale;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        if (isMale) {
            return "Male";
        } else {
            return "Female";
        }
    }
}

class DetailPerson {
    public static void main(String[] args) {
        Person detail = new Person();
        detail.setName("Gilgamesh");
        detail.setAge(99);
        detail.setGender(true);
        System.out.printf("Nama: %s\nUmur: %d\nGender: %s",detail.getName(), detail.getAge(),detail.getGender());
    }
}
