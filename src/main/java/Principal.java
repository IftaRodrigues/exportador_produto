import com.manoelcampos.exportador.Coluna;
import com.manoelcampos.exportador.ExportadorListaProduto;
import com.manoelcampos.exportador.Produto;

import java.util.ArrayList;
import java.util.List;

/**
 * Executa a aplicação Exportador Simple Factory.
 * @author Manoel Campos da Silva Filho
 */
public class Principal {

    public static void main(String[] args) {
        final List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("TV", "LG", "132-A", 120));
        produtos.add(new Produto("Notebook", "Asus", "New age", 341));
        produtos.add(new Produto("Smartphone", "Samsung", "Galaxy S10", 214));

        ExportadorListaProduto exportadorHTML = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorHTML.exportar(produtos));

        ExportadorListaProduto exportadorMd = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em Markdown\n");
        System.out.println(exportadorMd.exportar(produtos));
        
        Coluna coluna=exportadorMd.addNewColuna(Principal::precoComDesconto, "Preco com Desconto");
        exportadorHTML.addColuna(coluna);
        
        exportadorHTML.addColuna(coluna);
        
        System.out.println(exportadorMd.exportar(produtos));
        System.out.println(exportadorHTML.exportar(produtos));
        
        
        
    }
    public static double precoComDesconto(Produto produto){
        return produto.getEstoque()*0.9;
    }
}
