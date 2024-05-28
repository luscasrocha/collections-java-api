package List.Pesquisa;

//pra usar o list, precisa importar
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    //construtor de livro
    public CatalogoLivros() {
        //instancia um array list vazio
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        // cria uma lista vazia pra ir adicionando os autores
        List<Livro> livrosPorAutor = new ArrayList<>();
        //verifica primeiro se a lista de livros está vazia para não precisar continuar no método
        if (!livroList.isEmpty()){
            //cria laço de repetição
            for (Livro l : livroList) {
                //se o autor do livro for o msm digitado, adiciona ele na lista vazia que criei
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)    {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){}{
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
    }
        return livroList;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livroPorTitulo;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}