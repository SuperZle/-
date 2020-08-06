public class AninalTest {
    public static void who(Animal animal){
        animal.sleep();
        if (animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.nb();
        }else if (animal instanceof Pig){
            Pig pig=(Pig)animal;
            pig.eat();
        }
    }
    public static void main(String[] args) {
        Animal a1= new Cat();
        Animal a2= new Pig();
        who(a1);
        who(a2);
    }
}
