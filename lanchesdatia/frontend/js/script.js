const LINK_API = 'https://localhost:8080/';
const pd_form = document.getElementById('pd_form');
const pd_resultado = document.getElementById('pd_resultado');

pd_form.addEventListener("submit", async (e) => {
    e.preventDefault();
    const dados = {
        nome: pd_form.nome.value,
        categoria: pd_form.categoria.value,
        descricao: pd_form.descricao.value,
        disponivel: pd_form.disponivel.checked,
        preco: parseFloat(pd_form.preco.value)
    }

try{
    const resposta = await fetch(`${LINK_API}api/produtos`, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(dados)
    });

    const jsonDadosRetorno = await resposta.json();
    pd_resultado.textContent = JSON.stringify(dados, null, 2);
    //pd_resultado.textContent = "Cadastrado com sucesso!";
    }catch(err){
        document.getElementById('dados').textContent = 'Erro ao enviar dados';
    }
})
