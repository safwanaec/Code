public class templateTest {
    int roll;
    String favouriteFood;
    String name;
    int weight;

    void assaing(String Name, int rollNumber, String food, int Weight){
        name = Name;
        roll = rollNumber;
        favouriteFood = food;
        weight = Weight;
    }

    void printing(){
        System.out.println("My name is "+name);
        System.out.println("My class roll is "+roll);
        System.out.println("My favourite food is "+favouriteFood);
        System.out.println("My weight is "+weight+" kg");
    }
}
