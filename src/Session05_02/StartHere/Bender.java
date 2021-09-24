package Session05_02.StartHere;

public abstract class Bender  extends Human{

    private String element;
    private boolean isAvatar;

    public Bender(String name, String dob, String gender, String element) {
        super(name, dob, gender);
        this.element = element;
        super.setBender(true);
        super.setStamina(200);
        isAvatar = false;
    }

    @Override
    public void attack(Human h) {
        if(this.getStamina() > 0){
            System.out.printf("%s attacks %s with a bending skill", getName(), h.getName());
        }
        setStamina(getStamina()-20);
    }

    public abstract void bend();

    public String getElement() {
        return element;
    }

    public boolean isAvatar() {
        return isAvatar;
    }

    public void setAvatar(boolean avatar) {
        isAvatar = avatar;
    }

    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Bender{" +
                "element='" + element + '\'' +
                "} " + super.toString();
    }
}
