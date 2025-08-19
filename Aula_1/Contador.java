package Aula_1;

//classe é uma referência à um objeto
public class Contador {
    //atributo
    int valor;

    //construtor
    public Contador() {
        valor = 0;
    }

    //métodos
    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }
}