package Session05_02.StartHere;

public class FireBender extends Bender {
    private boolean canLavaBend;
    private boolean canFireBend;
    private boolean canLightningBend;

    public FireBender(String name,
                      String dob,
                      String gender,
                      boolean canFireBend,
                      boolean canLavaBend,
                      boolean canLightningBend) {
        super(name, dob, gender, "fire");
        this.canLavaBend = canLavaBend;
        this.canFireBend = canFireBend;
        this.canLightningBend = canLightningBend;
    }

    @Override
    public void attack(Human h) {
        if(getStamina() > 0){
            System.out.printf("%s attacks %s with fire ball\n", getName(), h.getName() );
        }
        setStamina(getStamina()-20);
    }

    @Override
    public void bend() {
        System.out.printf("%s does some exceptional fire bending\n", getName());
    }

    public boolean isCanLavaBend() {
        return canLavaBend;
    }

    public void setCanLavaBend(boolean canLavaBend) {
        this.canLavaBend = canLavaBend;
    }

    public boolean isCanFireBend() {
        return canFireBend;
    }

    public void setCanFireBend(boolean canFireBend) {
        this.canFireBend = canFireBend;
    }

    public boolean isCanLightningBend() {
        return canLightningBend;
    }

    public void setCanLightningBend(boolean canLightningBend) {
        this.canLightningBend = canLightningBend;
    }

    @Override
    public String toString() {
        return "FireBender{" +
                "canLavaBend=" + canLavaBend +
                ", canFireBend=" + canFireBend +
                ", canLightningBend=" + canLightningBend +
                "} " + super.toString();
    }
}
