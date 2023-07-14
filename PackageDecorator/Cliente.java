package PackageFachada;

public class Cliente {

    public static void main(String[] args) {
        
        Notificador notify = new Whatsapp(new SMS); 
        notify.notificar();
    }
}