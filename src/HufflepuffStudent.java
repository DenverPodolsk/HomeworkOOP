public class HufflepuffStudent extends HogwartsStudent {
    private int diligence;
    private int layalty;
    private int honesty;

    public HufflepuffStudent(String name,int magic,int transgression,int diligence,int layalty,int honesty){
        super(name,magic,transgression);
        this.diligence=diligence;
        this.layalty=layalty;
        this.honesty=honesty;
    }
    public int getDiligence(){
        return diligence;
    }
    public void setDiligence(int diligence){
        this.diligence=diligence;
    }
    public int getLayalty(){
        return layalty;
    }
    public void setLayalty(int layalty){
        this.layalty=layalty;
    }
    public int getHonesty(){
        return honesty;
    }
    public void setHonesty(int honesty){
        this.honesty=honesty;
    }
    private int ability(){
        return diligence+layalty+honesty;
    }
    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent){
        int ability1=ability();
        int ability2=hufflepuffStudent.ability();
        if (ability1>ability2) {
            System.out.println("Пуферендуец %s лучше, чем Пуферендуец %s:%d VS %d%n", getName(),hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability2>ability1) {
            System.out.println("Пуферендуец %s лучше, чем Пуферендуец %s:%d VS %d%n",hufflepuffStudent.getName(),getName(),ability2,ability1);

        }else {
            System.out.println("Пуферендуец %s такой же,как Пуферендуец %s:%d VS %d%n",hufflepuffStudent.getName(),getName(),ability1,ability2);
        }
    }
    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d;верность: %d;чесность: %d", super.toString(), diligence, layalty, honesty);
    }
}
