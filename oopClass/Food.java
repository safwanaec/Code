interface Food {
    void getFood();
}

class Pizza implements Food {
    public String s="Pizza";  

    public void getFood() {
        System.out.println("This is " + s);
    }
}

class Cake implements Food {
    public String s="Cake";  

    public void getFood() {
        System.out.println("This is " + s);
    }
}
