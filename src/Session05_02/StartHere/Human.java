package Session05_02.StartHere;

public class Human {
    private String name;
    private String dob;
    private String gender;
    private boolean isBender;
    private int stamina;

    public Human(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        isBender = false;
        stamina = 100;
    }

    public boolean isBender() {
        return isBender;
    }

    public void setBender(boolean bender) {
        isBender = bender;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        if (stamina < 0){
            System.out.printf("%s is out of stamina. Cannot keep fighting", getName());
        }
        this.stamina = stamina;
    }

    public void attack(Human h) {
        if (stamina > 0) {
            System.out.printf("%s attacks with fists and leg kicks %s\n", this.name, h.getName());
        }
        stamina -= 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}