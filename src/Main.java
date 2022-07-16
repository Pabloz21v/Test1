public class Main {
    public static void main(String[] args) {
        suma(12,22,300);

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static void suma(int a,int b,int c){
      int resultado = a + b + c;
        System.out.println(resultado);
    }

}

class Coche{
    public int puertas = 4;
    public void SumarPuertas(){
        this.puertas++;
    }
}