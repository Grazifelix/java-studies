package SRP.Problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){produtos.add(produto);}
    
    public void removerProduto(Produto produto){produtos.remove(produto);}

    public BigDecimal calcularTotal() {
        return produtos.stream()
        .map(Produto::getValor)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<OrdemDeCompra> buscarOrdensDeCompra(){
        //retorna lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void alterarOrdemDeCompra(){
        //altera na base de dados
    }

    public void salvarOrdemCompra() {
        //salvar lista de produtos na base de dados
    }

    public void enviarEmail(String email){
        //enviar email da ordem de compra 
    }
    
    public void imprimirOrdemDeCompra(){
        //imprime ordem de compra
    }

    /*Nesse exemplo temos mais de uma responsabilidade na classe: TRABALHAR COM A LISTA DE PRODUTOS LOCALMENTE, 
     * FAZER CONEXÃO COM REPOSITORIO E ENVIAR EMAIL - Que são 3 responsabilidades diferentes;
     * 
     * SOLUÇÃO: separar cada responsabilidade diferente em classes diferentes.
     */
}
