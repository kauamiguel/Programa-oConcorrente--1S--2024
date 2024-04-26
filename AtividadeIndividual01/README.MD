SISTEMA BANCÁRIO

Esse projeto é referente a disciplina de programação concorrente e distribuída, onde foi ensinado os conceitos de concorrência e maneiras de utiliza-la. Com isso, foi pedido um trabalho onde simula um sistema de transferência de dinheiro entre clientes de lojas e deve-se cuidar para não haver inconsistência de dados. Detalhes do projeto estão descritos abaixo.

AT2/N1 - Atividade prática individual - Bimestre N1
Crie um projeto (em Java 17) para representar um sistema bancário utilizando threads e os conceitos vistos em sala.
O sistema deve conter pelo menos as seguintes entidades:

● Banco;
● Loja;
● Funcionário;
● Cliente;
● Conta;

E deve conter um total de:

● 1 banco;
● 2 lojas;
● 4 funcionários (2 por loja);
● 5 clientes;

Cada cliente:

● Deve ser uma thread;
● Deve possuir uma conta com um saldo inicial de R$ 1.000,00;
● Deve realizar compras, de R$ 100,00 ou R$ 200,00, alternando as lojas, até o saldo da conta estar
vazio.

Cada loja:

● Deve possuir uma conta, para receber os pagamentos dos clientes;
● Deve pagar os funcionários assim que possuir o valor dos seus salários (R$ 1.400,00);
Cada funcionário:
● Deve ser uma thread;
● Deve possuir duas contas, uma para receber o salário da loja e outra de investimentos;
● Deve investir 20% do salário na conta de investimentos logo após seu recebimento.
O banco:
● Deve intermediar as transações de forma síncrona e coordenada, garantindo a consistência dos
saldos das contas.

Além disso, o sistema deve exibir o valor das transferências e o saldo final de cada conta, garantindo que os saldos estejam consistentes ao fim da execução, independente da ordem em que as transações foram feitas.
Critérios de avaliação

O projeto vale no máximo 2 pontos na nota do bimestre (N1), divididos da seguinte forma:

● Criação das entidades propostas: 0.5 (0.1 por entidade); ○ Correta criação de cada classe e possíveis métodos;

● Implementação das funcionalidades: 1 (0.25 por entidade);

○ Serão considerados a lógica utilizada e a corretude das operações que cada entidade
deve conter.

● Estruturação e organização do código: 0.4;

○ Divisão do projeto em classes;

○ Modularização do código, utilizando métodos sempre que possível;

○ Organização/clareza do código (nomes significativos de variáveis, indentação, etc.);

● Organização do GitHub (README, comentários e tamanho dos commits, etc.) (0.1);
Observações

● O trabalho deve ser feito individualmente, portanto qualquer tipo de plágio/cola será penalizado (o projeto receberá nota 0).

● Projetos com erro de sintaxe ou que não possam ser executados irão receber nota 0 também

● A entrega será dia 22/04, até 23:59, pelo AVA.

● O envio deve conter apenas um link para o repositório (que deve estar público) com o código do
projeto.

○ NÃO ENVIEM UM ZIP OU COLOQUEM O PROJETO ZIPADO NO GITHUB!