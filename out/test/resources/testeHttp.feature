# language: pt
Funcionalidade:
  Eu, enquanto ******************
  Preciso que o sistema ******************
  Para que eu possa efetuar os testes

  Cenário: Testar métoodo Get
    Dado    que fiz o Get para api
    E       abri a página de teste
    Então   valido


  Cenário:  GET request
    Dado Set GET api endpoint as "signup"
    E Set HEADER param request content type as "application/json"
    E Set HEADER param response accept type as "application/json"
    E Set Query param as "empty"
    E Raise "GET" HTTP request
    Então Valid HTTP response should be received
    E Response http code should be 200
    E Response HEADER content type should be "application/json"
    E Response BODY should not be null or empty
    E Response BODY parsing for "GET__signup" should be successful