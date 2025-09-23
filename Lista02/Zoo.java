
import java.util.ArrayList;
public class Zoo {
    private ArrayList<Animal> animals;
    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal) {
        this.animails.add(animal);
    }
    public ArrayList<Animal> ListAniamls() {
        return this.animals;
    } 
    public boolean removeAnimal(long id){
        for(Animal animal : animals) {
            if(animal.id == id) {
                animals.removeAnimal(animal);
                return true;
            }
            return false;
        }
    }
}