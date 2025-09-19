public class Circulo implements FormaGeometrica {
    private int raio;
    private static final double PI = 3.1415;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override 
    public double area() {
        return pi*raio*raio;
    }
    @Override
    public double comprimento(){
        return 2*pi*area;
    }
    @Override
    public void imprimirDados() {
        System.out.println("Circulo de raio " + raio + ", area " + area() + " e comprimento " + comprimento());
    }

}