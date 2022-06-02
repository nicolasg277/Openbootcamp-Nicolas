
public class Main {

    public static void main(String[] args){
        //primera parte
        suma(3,4,5);

        //Segunda parte
        Coche miCoche = new Coche();
        miCoche.IncrementaPuerta();
        System.out.println(miCoche.puertas);
    }
    //primera parte
    public static void suma(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);

    }
}
// segunda parte
class Coche{
    public int puertas = 4;

    public void IncrementaPuerta(){
        this.puertas++;
    }
}