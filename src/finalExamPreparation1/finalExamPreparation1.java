package finalExamPreparation1;

public class finalExamPreparation1 {
    private String name;
    private  int HP;
    private  int MP;


    // конструктор-> създава нови обекти
    // alt + insert == конструктор

    public  finalExamPreparation1(String name,Integer HP,Integer MP){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
    }
    public void editHP(Integer newHP){
        // съдържанието да се промени
        this.HP = newHP;

    }
    public void editMP(Integer newMP){
        // съдържанието да се промени
        this.MP = newMP;

    }
}
