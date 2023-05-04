+# Projetos 

Aqui, vocês encontrarão o calendário de entregas. As entregas pelo calendário comporão muitas das notas de vocês. Abaixo, existe

## Calendário de entregas

> ``24/04`` Kick-off projeto final;
> - [x] Criar um repositório **privado** da equipe;
> - [x] Adicionar a mim ```@sauloafoliveira``` como membro do projeto;
> - [x] Buscar formar equipes entre 04-05 colegas;
> - [x] Commitar um readme.me com a escolha dos membros do projeto.
>
>  **Grupo**
>  
>   -"Murilo Francio"-
>   
>   -"Eloize Kondras"-
>   
>   -"Nara Leal"-
>
>   -"Juliano"-
-------------------------------------------------
> ``03/05`` Seleção dos projetos;
> - [x] Escolha do tema do projeto.
>
> **Controle de Estoque**
-------------------------------------------------
> ``18/05`` Definições da camada de Modelos;
> - [ ] Diagrama de Classes;
> - [ ] Diagrama de Entidade-Relacional;
> - [ ] Script SQL de criação do banco de dados do projeto.

> ``05/06`` Definições da camada de Visão;
> - [ ]  Protótipo de telas com base nos requisitos;
> - [ ]  Definição da identidade visual.

> ``14/06`` Definições da camada de Controle;
> - [ ]  Integração com Banco de dados;
> - [ ] (CRUD básico das entidades;

> ``29/06`` Definições da camada de Visão & Controle;
> - [ ] Integração front & back;

> ``30/06`` à ``04/07``Acompanhamento de projeto;

> ``05/07`` Ensaio Pitch;

> ``06/07`` Apresentação final.

-----------------------------------------------------
# Projeto Escolhido

## Almoxarifado de hospital

O sistema para hospitais permite que sua equipe tenha total controle dos recursos e materiais utilizados em procedimentos médicos. A ideia é   digitalizar um processo comumente manual, cujo controle se dá por planilhas dispersas no sistema de uma operadora de saúde.

O Almoxarifado pode ser conceituado como sendo o local destinado à guarda e conservação de materiais, em recinto coberto ou não, adequado à sua natureza, tendo a função de destinar espaços onde permanecerá cada item aguardando a necessidade do seu uso, ficando sua localização e disposição interna acondicionados à política geral de estoques. O responsável pelo Almoxarifado deve possuir alto grau de honestidade, lealdade, confiança e disciplina.

### Requisitos

- [ ] O sistema deverá manter (cadastrar, alterar, buscar) as informações de materiais;
- [ ] O sistema deverá manter (entrada, saída e consulta de materiais) o almoxarifado;
- [ ] O sistema deverá gerar relatórios de vendas realizadas, materiais com baixo estoque (até 05 unidades) e materiais em falta;
- [ ] O sistema deverá manter (cadastrar, alterar, buscar) informações de funcionários;
- [ ] O sistema deverá manter (cadastrar, alterar, buscar) informações de fornecedores.

### Informações adicionais

Em relação aos materiais, devem ser guardadas as seguintes informações:  ``nome``, ``código de barras``, ``valor de compra``,  ``fornecedor``,  ``mínima``, ``fabricante`` e ``descrição`` como obrigatórias. Já em relação aos funcionários devem ser guardadas as seguintes informações: ``matrícula``, ``nome``, ``endereço``, ``telefone``, ``CPF``, ``data de nascimento``,  a ``situação`` (``ativo`` ou ``inativo``), ``e- mail``, ``cargo``, ``login`` e ``senha``. Sendo todas elas obrigatórias. Por fim, em relação aos fornecedores, devem ser guardadas as seguintes informações: ``matrícula``, ``nome fantasia``, ``endereço``, ``telefone``, ``CNPJ``, ``tempo de entrega`` e ``e-mail``. Sendo todas elas obrigatórias.

Ambos relatórios de entrada e de saída deverão ser gerados a partir da indicação de uma data inicial a uma data final. 

No estoque, deverão ser mostradas as seguintes  informações: o nome do material, sua quantidade em estoque, seu fabricante e seu fornecedor. 

Em relação às novas compras de materiais, deverão ser guardadas as seguintes informações: um código de identificação dessa demanda, o funcionário que a realizou, o(s) produto(s) solicitados(s), data da demanda, o valor total da compra, sua forma de pagamento e sua situação (ativa ou cancelada).

Os funcionário poderam realizar baixas no Almoxarido, isto é, demandar materiais para serem utilizados pelo hospital. Uma vez que essa demanda for atendida, atualiza-se a quantidade de elementos no almoxarifado.
