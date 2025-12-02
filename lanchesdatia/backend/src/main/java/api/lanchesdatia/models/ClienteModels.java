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
    private String email; //precisa validar

    @Column(nullable = false)
    private String telefone; //precisa validar

    @Embedded
    private EnderecoModels endereco;

    @Column(nullable = false, name = "data_cadastro")
    private LocalDateTime dataCadastro; //precisa gerar automaticamente

    @Column(nullable = false)
    private boolean ativo = true;

    @Column
    private String preferencias;

    @Column
    private String historicoCompras; //a ser implementado depois

    @Column(unique = true)
    private String cpf; //a validar

    @Column
    private String pedidos; //pedidos associado ao cliente
}
