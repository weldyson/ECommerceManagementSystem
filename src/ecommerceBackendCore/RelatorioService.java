package ecommerceBackendCore;

import java.util.ArrayList;

public class RelatorioService {


    public double calcularTotalPatrimonio(ArrayList<Produto> lista) {
        double total = 0;
        for (Produto p : lista) {
            total += p.getPreco() * p.getEstoque();
        }
        return total;
    }


    public ArrayList<Produto> filtrarProdutosCaros(ArrayList<Produto> lista) {
        ArrayList<Produto> caros = new ArrayList<>();
        for (Produto p : lista) {
            if (p.getPreco() > 500) {
                caros.add(p);
            }
        }
        return caros;
    }
}