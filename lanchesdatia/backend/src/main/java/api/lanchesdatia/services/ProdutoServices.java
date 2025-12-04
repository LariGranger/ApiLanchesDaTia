// classe para controlar a lógica de negócio, regras, cálculos, validações, fluxos, tratamento de erros, integração com outras partes
// conversa com o repository e diz o que fazer
package api.lanchesdatia.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoServices {
    @Autowired
    private ProdutoRepository produtoRepository;

    //listar todos
    public List<ProdutoModels> listarTodos(){
        if(disponivel){
            return produtoRepository.findAll();
        }
    }

    //listar indisponiveis
    public List<ProdutoModels> listarIndisponiveis(){
        if(!disponiveis){
            return produtoRepository.findAll();
        }
    }


    //buscar por id
    public ProdutoModels buscarPorId(Long id){
        Optional<ProdutoModels> produto = produtoRepository.findById(id);
        return lanche.orElse(null);
    }
    
    //buscar por categoria
    public List<ProdutoModels> buscarPorCategoria(String categoria){
        Optional<ProdutoModels> produtosPorCategoria = Optional.ofNullable(produtoRepository.findByCategoria(categoria));
        return (List<ProdutoModels>) produtosPorCategoria.orElse(null);
    }

    //adicionar produto
    public ProdutoModels adicionarProduto(ProdutoModels lanche){
        return produtoRepository.save(lanche);
    }

    //atualizar produto
    public ProdutoModels atualizarProduto(Long id, String nome, String descricao, double preco, String categoria, boolean disponivel, int tempoPreparo, Lanche lancheAtualizado){
        Optional<ProdutoModels> lancheExiste;
        if(lancheExiste.isPresent()){
            ProdutoModels lanche = lancheExiste.get();
            lanche.setNome(lancheAtualizado.getNome());
            lanche.setDescricao(lancheAtualizado.getDescricao());
            lanche.setPreco(lancheAtualizado.getPreco());
            lanche.setCategoria(lancheAtualizado.getCategoria());
            lanche.setDisponivel(lancheAtualizado.getNome());
            lanche.setNome(lancheAtualizado.getNome());
        }
    }

    //deletar lanche
    public void deletarProduto(Long id){
            produtoRepository.deleteById(id);
    }
}
