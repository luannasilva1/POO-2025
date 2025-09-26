public class Dog extends Animal {
    public Dog(long id,int age, double weight){
        super(id, "Buddy", age, weight);
        this.abilities.add("sniff");
    }
    @Override
    public String sound() {
        return name + " auau";
    }
}