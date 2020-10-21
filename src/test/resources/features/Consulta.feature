 #language: pt
Funcionalidade: Consultar dados de uma pessoa no sistema
 
 @consultaPositiva
Cenário: Consultar dados de um usuário no sistema 
    Dado que estou fazendo uma colsulta dos dados do usuário
    Quando consulto os dados com o telefone "11" "985384870"
    Então Valido que a consulta foi realizada com sucesso
    
     @consultaNegativoTelefone
Cenário: Consultar dados de um usuário no sistema 
    Dado que estou fazendo uma colsulta dos dados do usuário
    Quando consulto os dados com o telefone "11" "9010202303"
    Então Valido que usuário não está cadastrado
