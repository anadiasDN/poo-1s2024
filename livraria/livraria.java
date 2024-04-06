package livraria0604;

import java.util.ArrayList;

public class livraria {

    public ArrayList<livro> Livro;

    public livraria(){
        this.Livro = new ArrayList<>();

    }

    public void cadastrarLivro(livro Livro){
        this.Livro.add(Livro);
    }

    public String listarLivros(){

        String listarLivro = "";
        for (livro l : this.Livro){
            listarLivro += l.id + " . " + l.titulo + "\n";

        }
        return listarLivro;

    }




}
