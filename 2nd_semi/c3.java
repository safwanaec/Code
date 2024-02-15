public class c3 implements Parent1, Parent2 {
    public static void main(String[] args) {
        
    }

}
interface Parent1 {
  
}
interface Parent2 {

}

/*
 * When we inherit the properties of a class into another class,
 * a copy of the super-class (parent class) is created in the sub-class (child class) object.
 * 
 * The Diamond problem occures when a child class tries to inherit multiple classes but more then 1 parent class has the same method or 
 * elements. thus when an object of the child class is used to call such element, it gets confused which one to call.
 */