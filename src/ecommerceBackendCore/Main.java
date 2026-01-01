package ecommerceBackendCore;

public class Main {
    public static void main(String[] args) {

        BancoDeDados bd = new BancoDeDados();

        try {

            bd.salvar(new Produto(1, "Notebook", 3500.00, 10));
            bd.salvar(new Produto(2, "Mouse", 50.00, 100));
            bd.salvar(new Produto(3, "Teclado", 150.00, 50));


            bd.salvar(new Produto(4, "Celular", -2000.00, 5));


            bd.salvar(new Produto(1, "Monitor", 800.00, 20));

        } catch (Exception e) {

            System.out.println("Erro capturado: " + e.getMessage());
        }


        Produto encontrado = bd.buscarPorNome("Notebook");
        if (encontrado != null) {
            try {

                encontrado.reduzirEstoque(20);
            } catch (Exception e) {
                System.out.println("Erro ao reduzir estoque: " + e.getMessage());
            }
        }

        // Relatórios
        RelatorioService relatorio = new RelatorioService();

        // Calcula patrimônio total
        double patrimonio = relatorio.calcularTotalPatrimonio(bd.getProdutos());
        System.out.println("Patrimônio total em estoque: R$ " + patrimonio);

        // Lista produtos caros
        System.out.println("Produtos caros:");
        for (Produto p : relatorio.filtrarProdutosCaros(bd.getProdutos())) {
            System.out.println("- " + p.getNome());
        }
    }
}