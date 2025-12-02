//refatorar
// classe para controlar a lógica de negócio, regras, cálculos, validações, fluxos, tratamento de erros, integração com outras partes
// conversa com o repository e diz o que fazer
package api.lanchesdatia.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoServices {
@Autowired
    private LanchesRepository lancheRepository;

    public List<Lanche> listarTodos(){
        return lancheRepository.findAll();
    }

    public Lanche buscarPorId(Long id){
        Optional<Lanche> lanche = lancheRepository.findById(id);
        return lanche.orElse(null);
    }
    
    public List<Lanche> buscarPorCategoria(String categoria){
        Optional<Lanche> lanchesPorCategoria = Optional.ofNullable(lancheRepository.findByCategoria(categoria));
        return (List<Lanche>) lanchesPorCategoria.orElse(null);
    }

    public Lanche adicionarLanche(Lanche lanche){
        return lancheRepository.save(lanche);
    }

    public Lanche atualizarLanche(Long id, String nome, String descricao, double preco, String categoria, boolean disponivel, int tempoPreparo, Lanche lancheAtualizado){
        Optional<Lanche> lancheExiste;
        if(lancheExiste.isPresent()){
            Lanche lanche = lancheExiste.get();
            lanche.setNome(lancheAtualizado.getNome());
            lanche.setDescricao(lancheAtualizado.getDescricao());
            lanche.setPreco(lancheAtualizado.getPreco());
            lanche.setCategoria(lancheAtualizado.getCategoria());
            lanche.setDisponivel(lancheAtualizado.getNome());
            lanche.setNome(lancheAtualizado.getNome());
        }
    }
    public void deletarLanche(Long id){
            lancheRepository.deleteById(id);
    }
}
