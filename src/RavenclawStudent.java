public class RavenclawStudent extends HogwartsStudent {

    private int cleverness;
    private int wisdom;
    private int vit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int vit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.vit = vit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability() {
        return cleverness + wisdom + vit + creativity;
    }
    public void compareRavenclaw(RavenclawStudent ravenclawStudent){
        int ability1=ability();
        int ability2=ravenclawStudent.ability();
        if (ability1>ability2) {
            System.out.println("Когтевранец %s лучше, чем Когтевранец %s:%d VS %d%n", getName(),ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2>ability1) {
            System.out.println("Когтевранец %s лучше, чем Когтевранец %s:%d VS %d%n",ravenclawStudent.getName(),getName(),ability2,ability1);

        }else {
            System.out.println("Когтевранец %s такой же,как Когтевранец %s:%d VS %d%n",ravenclawStudent.getName(),getName(),ability1,ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; ум: %d;мудрость: %d;сообразительность: %d;творчество: %d,", super.toString(), cleverness, wisdom, vit,creativity);
    }
}
