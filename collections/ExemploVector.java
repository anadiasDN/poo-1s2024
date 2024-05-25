package collections;

import java.util.ArrayList;

public class ExemploVector{

    public static void main (String[] args){

        ArrayList<String> nomes = new ArrayList<> ();
    
        nomes.add("alice");
        nomes.add("carol");
        nomes.add("bob");

        System.out.println(nomes.get(1));

        for (String nome : nomes){
            System.out.println(nome);
        }

        if(nomes.contains("carol")){

            System.out.println("carol esta na lista");
        }

        nomes.remove("carol");

        if(!nomes.contains("carol")){

            System.out.println("carol nao esta na lista");
        }

        nomes.clear();
        if(nomes.isEmpty()){
            System.out.println("a lista esta vazia");
        }

    }
    
}
