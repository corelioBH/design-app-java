package gabarito.laboratorio3.parte2.classesdesnecessarias;

import gabarito.laboratorio3.parte2.NetflixContent;
import gabarito.laboratorio3.parte2.NetflixContentType;
import gabarito.laboratorio3.parte2.Observer;

public class FilmeContent implements Observer {

    @Override
    public void postContent(NetflixContent content) {
        if(content.getContentType().equals(NetflixContentType.FILME)){
            System.out.println(String.format("Filme %s adicionado ao catálogo!", content.getName()));
        }
    }

}
