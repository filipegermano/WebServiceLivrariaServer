package br.edu.ifpb.pos.webservicelivraria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author FILIPE
 */
@WebService(serviceName = "LivrariaService")
public class LivrariaService implements Livraria {

    private final HashMap<String, Livro> livros = new HashMap<>();

    @Override
    public List<String> localizarLivros(String texto) {
        List<String> livrosEncontrados = new ArrayList<>();
        for (String titulo : livros.keySet()) {
            if (titulo.contains(texto)) {
                livrosEncontrados.add(titulo);
            }
        }
        return livrosEncontrados;
    }

    @Override
    public Livro recuperarLivro(String texto) {
        return livros.get(texto);
    }

    @Override
    public boolean salvar(Livro livro) {
        try {
            livros.put(livro.getTitulo(), livro);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
