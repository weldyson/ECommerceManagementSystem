public class Produto {
    private Integer id, estoque;
    private String nome;
    private Double preco;

    // Construtor que recebe todos os dados
    public Produto(int id, String nome, Double preco, Integer estoque) {
        this.id = id;
        this.nome = nome;
        setPreco(preco);     // usa o setter para validar
        setEstoque(estoque); // usa o setter para validar
    }

    // Getter e Setter para preco
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    // Getter e Setter para estoque
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque < 0) {
            throw new IllegalArgumentException("Estoque inválido");
        }
        this.estoque = estoque;
    }

    // Getter e Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}