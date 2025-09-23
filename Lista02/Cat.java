public class Cat extends Aniaml {
    public Cat(long id, int age, double weight) {
        super(id,"Whiskers", age, weight);
        this.abilities.add("agility");
    }
    @Override
    public String sound() {
        return "meow";
    }
}