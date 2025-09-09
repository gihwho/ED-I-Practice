public class Pilha {
    // atributos
    private final static int TAM_DEFAULT = 100;
    private int topoPilha;
    private char elementos[];

    // construtores
    public Pilha(int tamanho) {
        elementos = new char[tamanho];
        topoPilha = -1;
    }

    public Pilha() {
        this(TAM_DEFAULT);
    }

    // métodos
    public void push(char e) throws Exception {
        if (!isFull()) {
            elementos[++topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de Pilha");
        }
    }

    public char pop() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha--];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    public char topo() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    public int sizeElements() {
        return topoPilha + 1;
    }

    public boolean isEmpty() {
        return topoPilha == -1;
    }

    public boolean isFull() {
        return topoPilha == elementos.length - 1;
    }
}