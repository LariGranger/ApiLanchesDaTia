//refatorar
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
@RequestMapping("/api/lanches")
public class ProdutoController {
public class LanchesController {
    // faz injenção de dependência de forma automatica pra não ter que usar, por exemplo, new ProdutoServices()
    @Autowired
    private LanchesServices lanchesServices;

    @GetMapping
    public ResponseEntity <List<Lanche>> listarTodos() {
        List<Lanche> lanches = lanchesServices. listarTodos();
        return ResponseEntity.ok(lanches);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lanche> buscarPorId(@PathVariable Long id) {
        Lanche lanche = lanchesServices.buscarPorId(id);
        if(lanche != null){
            return ResponseEntity.ok(lanche);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{categoria}")
    public ResponseEntity<Lanche> buscarPorCategoria(@PathVariable String categoria) {
        Lanche lanche = (Lanche) lanchesServices.buscarPorCategoria(categoria);
        if(lanche != null){
            return ResponseEntity.ok(lanche);
        }
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping
    public ResponseEntity<Lanche> adicionarLanche(@RequestBody Lanche Lanche) {
      Lanche lancheNovo = lanchesServices.adicionarLanche(Lanche);
      return ResponseEntity.status(HttpStatus.CREATED).body(lancheNovo);
    }
    
    
}


/*
3. Buscar produtos por categoria - Filtra produtos de uma categoria
4. Adicionar novo produto - Insere um novo lanche ao cardápio
5. Atualizar produto - Modifica informações de um produto existente
6. Deletar produto - Remove um produto do cardápio */

}
