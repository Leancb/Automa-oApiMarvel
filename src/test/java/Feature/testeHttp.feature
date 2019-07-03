# language: pt
Funcionalidade:
  Eu, enquanto ******************
  Preciso que o sistema ******************
  Para que eu possa efetuar os testes

  Esquema do Cenário: Testar métoodo /v1/public/characters
    Dado    que carreguei driver
    E       abri a página de teste
    E       Efetuei login
    E       cliquei em GET characters
    E       informei nome <nome>
    E       informei nameStartsWith <nameStartsWith>
    E       informei modifiedSince <modifiedSince>
    E       informei comics <comics>
    E       informei series <series>
    E       informei events <events>
    E       informei stories <stories>
    E       ordenei por nome
    E       informei limit <limit>
    E       informei offset <offset>
    E       clicar no botão enviar
    Então   me retorna os dados
    Exemplos:
      | nome       | nameStartsWith | modifiedSince | comics | series | events | stories | limit | offset |
      | Spider-Man | Sp             | 01012019      | 01     | 02     | 03     | 01      | 10    | 01     |
