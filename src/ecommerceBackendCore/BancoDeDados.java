package ecommerceBackendCore;

import java.util.ArrayList;

public class BancoDeDados {

    private static ArrayList<Produto> produtos = new ArrayList<>();


    public void salvar(Produto p) {

        for (Produto existente : produtos) {
            if (existente.getId() == p.getId()) {
                throw new RuntimeException("ID já cadastrado");
            }
        }
        produtos.add(p);
    }


    public Produto buscarPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }


    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}