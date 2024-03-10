import java.util.ArrayList;

public class Ans2 {
    public static void main(String[] args) {
        Bag b = new Bag();
        b.add("Safwan");
        b.add("YO");
        b.add("YO");

        System.out.println(b.count("YO"));
    }
}


class Bag{
    ArrayList<Items> items = new ArrayList<>();

    public void add(String itemName){

        items.add(new Items(itemName));
    }

    public int count(String itemName){
        int count=0;

        for(Items item : items){
            if(item.ItemName == itemName){
                count++;
            }
        }
        return count;
    }

    class Items{
        String ItemName;
        int Quantity;

        Items(String ItemName){
            this.ItemName=ItemName;
        }
    }
}