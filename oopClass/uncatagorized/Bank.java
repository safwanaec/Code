package uncatagorized;
public class Bank {
    public static void main(String[] args) {
        bankTemplate acc = new bankTemplate();

        acc.setValue(1,"Obaydul Kader Sumon",11111110101010L,1000000L);
        acc.display();

        acc.setValue(2,"Obaydul Rana",11111110101011L,1000000L);
        acc.display();
        //acc.deposit();
    }
    
}
