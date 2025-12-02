package api.lanchesdatia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.lanchesdatia.repository.ClienteRepository;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;

    //lista clientes ativos
    //buscar clientes por Id
    //buscar clientes por e-mail
    //adicionar novo cliente - verifica e-mail e cpf unicos, define como ativo, gera dataCadastro, Armazena preferências, endereço e telefone se enviados, Campo pedidos inicia vazio.
    // Atualizar informações do cliente, Pode alterar nome, telefone, endereço, preferências, E-mail não pode ser alterado para um já existente, ● CPF não pode ser alterado para um já existente, Alterar status ativo/inativo é permitido. 

}


/**6. Fluxos Lógicos Principais
Fluxo: Cadastro de Cliente
1. Receber dados enviados.
2. Validar nome. (DEIXAR PARA QUARTA)
3. Validar e-mail. (DEIXAR PARA QUARTA)
4. Validar CPF. (DEIXAR PARA QUARTA)
5. Conferir se e-mail já existe. (DEIXAR PARA QUARTA)
6. Conferir se CPF já existe. (DEIXAR PARA QUARTA)
7. Criar registro.
8. Campo pedidos vazio.
9. Salvar com status ativo.

Fluxo: Atualização
1. Verificar se o cliente existe. (DEIXAR PARA QUARTA)
2. Validar campos enviados.
3. Conferir unicidade do e-mail se alterado. (DEIXAR PARA QUARTA)
4. Conferir unicidade do CPF se alterado. (DEIXAR PARA QUARTA)
5. Atualizar registro.

Fluxo: Consultas
● Listagem geral: mostrar apenas clientes ativos.
● Busca específica: mostrar tudo, inclusive inativos.
● Histórico de compras não é exposto por padrão. */


