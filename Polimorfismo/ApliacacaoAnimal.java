public class AplicacaoAnimal {
    public void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Cachorro();
        animais[3] = new Gato();
    }

    public static void interagirComAnimais(Animal[] animais){
        for(int i = 0; i < animais.length; i++){
            animais[i].fazerSom();
            
            if(animais[i] instanceof Cachorro) {
                Cachorro cachorro = (Cachorro) animais[i];
                cachorro.abanarRabo();
            } else if (animais[i] instanceof Gato) {
                Gato gato = (Gato) animais[i];
                gato.arranharMoveis();
            }            



        }
    }
}