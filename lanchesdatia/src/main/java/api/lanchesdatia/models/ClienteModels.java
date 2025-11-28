package api.lanchesdatia.models;

public class ClienteModels {

}


/*id Identificador único Numérico, gerado
pelo sistema

nomeCo
mpleto

Nome do cliente Obrigatório

email E-mail para contato Único no sistema,
obrigatório, deve ser
válido (ADICIONE,
MAS NÃO PRECISA
VALIDAR )

telefone Telefone do cliente Formato válido,
opcional (ADICIONE,
MAS NÃO PRECISA
VALIDAR )

enderec
o

Endereço (rua, número,
bairro, cidade)

(Tipado em uma
classe) obrigatório

dataCad
astro

Data em que o cliente entrou
no sistema

Gerado
automaticamente

ativo Define se o cliente ainda é

ativo

Booleano, padrão:
true

preferen
cias

Preferências de consumo
(ex: sem lactose,
vegetariano, sem cebola)

Texto opcional

historico
Compra
s

Lista de pedidos realizados
(futuro)

Inicialmente vazio
(ADD COMO STRING
NÃO OBRIGATÓRIA)

cpf Cadastro de Pessoa Física Obrigatório, único,
válido (ADICIONE,
MAS NÃO PRECISA
VALIDAR )

pedidos Lista de pedidos associados

ao cliente

Campo inicialmente
vazio (ADD COMO
STRING NÃO
OBRIGATÓRIA)*/