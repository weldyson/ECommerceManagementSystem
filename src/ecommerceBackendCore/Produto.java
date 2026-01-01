package ecommerceBackendCore;


public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int estoque;


    public Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        setPreco(preco);
        setEstoque(estoque);
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }


    public int getEstoque() {
        return estoque;
    }


    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque inválido");
        }
        this.estoque = estoque;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void reduzirEstoque(int quantidade) {
        if (quantidade > estoque) { // verifica se há estoque suficiente
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        this.estoque -= quantidade; // reduz o estoque
    }
}