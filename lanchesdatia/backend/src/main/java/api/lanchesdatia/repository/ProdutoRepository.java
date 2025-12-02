// classe que define as operações para trabalhar com banco, delete, dinfBy...
// Jpa já trás muitas coisas pré-prontas
package api.lanchesdatia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.lanchesdatia.models.ProdutoModels;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModels, Long> {

}
