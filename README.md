## Sobre
Desafio proposto pela Lecom, utilizando java e spring, desenvolver uma aplicação para modelar um sistema simples para atender demandas online de vendas de uma loja

O sistema deveria possuir pelo menos 3 micro serviços listados abaixo

1- Loja 

Reponsavel por:
<ul>
  <li>Conter informações básicas da loja</li>
  <li>Consultar os itens da api de catalogo</li>
  <li>Registrar a venda dos itens</li>
  <li>Registrar a entrega do produto e permitir seu acompanhamento</li>
</ul>

2- Catalogo
<ul>
  <li>Reponsavel por conter os itens a venda na loja.</li>
  <li>Armazenar a categoria do item , o nome e seu preço unitário</li>
</ul>

3- Transportadora
<ul>
  <li>Reponsavel por registar e permitir o processo de entrega</li>
  <li>Armazenar o identificador do pedido, endereço do remetente/destinatario, código de rastreamento e status</li>
</ul>

## Atenção

Somente as api foram implementadas nescessitando do postman para fazer suas requisiçõs. ( A colletion para facilitar se encontra no projeto com o nome Loja-api.postman_collection.json ) 

Quando for clonar o repositorio favor conferir os application.yml para verificar se a porta, o login e a senha conferem ao seu banco.

## Aviso

O Db do microserviço catalogo será populado automaticamente pelo flyway. Os demais microserviços não terão dados, sendo nescessario a criação de um pedido, caso queria consultar algum pedido

## Futuras implementações

<ul>
  <li>Validaçõs de dados</li>
  <li>Criação de uma interface para poder testar através dela</li>
</ul>
