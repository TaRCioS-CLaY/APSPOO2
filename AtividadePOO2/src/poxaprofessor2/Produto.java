package poxaprofessor2;

/**
 *
 * @author Clayton Garcia
 * Mat: 2016101697
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String infos(){
        String informacao = String.format("%-25.25s%.2f%10.10s ", this.getNome(),this.getPreco(),this.getQuantidade());
        return informacao;
    }
    
}
