package produto;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
    public Date dataValidade;

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String produto, double preco, int quantidade) {
        super(produto, preco, quantidade);
    }
    public void getDate(){
        Date date = new Date();
        this.dataValidade = date;
        System.out.println(date);
    }
}
