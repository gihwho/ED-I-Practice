package Aula_1;

public class testeContador {
    public static void main(String[] args) {
        //variável de instanciação
        Contador c1 = new Contador();
        Contador c2 = new Contador();

        c1.incrementar();
        c1.incrementar();
        c2.incrementar();

        System.out.printf("C1: %d\n", c1.valor);
        System.out.printf("C2: %d\n", c2.valor);
    }
}
