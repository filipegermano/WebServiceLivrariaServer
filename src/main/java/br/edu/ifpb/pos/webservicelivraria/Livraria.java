package br.edu.ifpb.pos.webservicelivraria;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author FILIPE
 */
public interface Livraria {
    
    @WebMethod
    public List<String> localizarLivros(String texto);
    
    @WebMethod
    public Livro recuperarLivro(String texto);
    
    @WebMethod
    public boolean salvar(Livro texto);
    
}
