package api.lanchesdatia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.lanchesdatia.models.ClienteModels;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModels, Long>{

}
