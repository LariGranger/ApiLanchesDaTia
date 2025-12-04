package api.lanchesdatia.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, unique = true)
    private String telefone; 

    @Embedded
    private EnderecoModels endereco;

    @Column(nullable = false, name = "data_cadastro")
    private LocalDateTime dataCadastro; 

    @Column(nullable = false)
    private boolean ativo = true;

    @Column
    private String preferencias;

    @Column
    private String historicoCompras;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Column
    private String pedidos; 
}
