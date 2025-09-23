public class Bird extends Animal {
    public Bird (long id, int age, double weight) {
        super(id, Tweety, age, weight);
        this.abilities.add("Fly");

        @Override
        public String sound() {
            return "piu";
        }

    }
}