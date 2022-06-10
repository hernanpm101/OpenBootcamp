
//HomeWorkFunctions

public class Main {
    public static void main(String[] args) {
        int resultado = sumaNumeros(4,6,8);
        System.out.println(resultado);
        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int sumaNumeros(int a, int b, int c){
        return a + b + c;
    }

    static class Coche {
        public int puertas = 0;

        public void aumentarPuertas(){
            this.puertas++;
        }
    }
}