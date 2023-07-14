package PackageFachada;

public class Cliente {
    public static void main(String[] args) {
        Fachada facha = new PlatformFachada();
        Transaccion Transaction = facha.realizartransaction();
    }
}