package adaptador;

import interfaz.Mensaje;
import legacy.Info;

public class Adapter implements Mensaje{
    private Info info;
    public Adapter(Info info){
        this.info=info;
    }
    @Override
    public void send(String texto){
        info.save(texto);
        info.register(texto);
    }
}

