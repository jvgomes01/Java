package principal;

import pessoa.Pessoa;
import produto.Produto;
import produto.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("Joao");
//        pessoa.setIdade(19);
//
//        Pessoa joao = new Pessoa();
//        joao.setNome("Cleberson");
//        joao.setIdade(25);
//
//        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
//        listaDePessoas.add(pessoa);
//        listaDePessoas.add(joao);
        //System.out.println(listaDePessoas);

        Produto produto = new Produto("Tenis Nike", 99.99, 10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto);
        System.out.println(listaDeProdutos.size());
        System.out.println(listaDeProdutos.getFirst());
        System.out.println(listaDeProdutos);

        ProdutoPerecivel leite = new ProdutoPerecivel("leite", 99.99, 15);
        System.out.println(leite);
        leite.getDate();
        System.out.println(leite.dataValidade);




}
}