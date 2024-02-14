import java.io.*;

class a141223 {

    public static void main(String args[]) throws IOException {
        FoodFactory planFactory = new FoodFactory();

        System.out.print("Enter the Food you want: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        Food p = planFactory.getPlan(planName);
        p.getFood();
    }
}



class FoodFactory {

    public Food getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("cake")) {
            return new Cake();
        } else if (planType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }
        return null;
    }
}

