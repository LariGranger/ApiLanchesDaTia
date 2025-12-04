// define as rotas da API, Recebe a requisição (GET, POST, etc.), traduz o que o usuário pediu, e repassa para o service.

package api.lanchesdatia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
public class LanchesController {
    // faz injenção de dependência de forma automatica pra não ter que usar, por exemplo, new ProdutoServices()
    @Autowired
    private ProdutosServices produtosServices;

    // listar produtos disponiveis
    @GetMapping
    public ResponseEntity <List<ProdutoModels>> listarTodos() {
        List<ProdutoModels> produtosDisponiveis = produtosServices.listarTodos();
        return ResponseEntity.ok(produtosDisponiveis);
    }

    // listar produtos indisponiveis
    @GetMapping("/{indisponiveis}")
    public ResponseEntity <List<ProdutoModels>> listarIndisponiveis() {
        List<ProdutoModels> produtosIndisponiveis = produtosServices.listarIndisponiveis();
        return ResponseEntity.ok(produtosIndisponiveis);
    }

    //buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModels> buscarPorId(@PathVariable Long id) {
        ProdutoModels produto = produtosServices.buscarPorId(id);
        if(produto != null){
            return ResponseEntity.ok(produto);
        }
        return ResponseEntity.notFound().build();
    }

    //buscar por categoria
    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<ProdutoModels> buscarPorCategoria(@PathVariable String categoria) {
        ProdutoModels produto = (ProdutoModels) produtosServices.buscarPorCategoria(categoria);
        if(lanche != null){
            return ResponseEntity.ok(produto);
        }
        return ResponseEntity.notFound().build();
    }
    


    //adicionar lanche 
    //parei aqui
    @PostMapping
    public ResponseEntity<ProdutoModels> adicionarProduto(@RequestBody ProdutoModels Lanche) {
      Lanche lancheNovo = lanchesServices.adicionarLanche(Lanche);
      return ResponseEntity.status(HttpStatus.CREATED).body(lancheNovo);
    }
    
    
}




}
