#language: pt
Funcionalidade: Cadastrar uma pessoa e seus dados


@cadastroPositivo
Cenário: Cadastrar um usuário no sistema
    Dado que estou fazendo o cadastro de uma pessoa
    Quando insiro os dados do "cadastro1"
    Então Valido que o cadastrado foi realizado
    
@cadastroNegativoCpf
Cenário: Cadastrar um usuário no sistema com cpf já cadastro
    Dado que estou fazendo o cadastro de uma pessoa
    Quando insiro os dados do "cadastro2"
    Então Valido que o cadastrado não foi realizado por duplicidade no cpf
    
 @cadastroNegativoTelefone
Cenário: Cadastrar um usuário no sistema com telefone já cadastrado
    Dado que estou fazendo o cadastro de uma pessoa
    Quando insiro os dados do "cadastro3"
    Então Valido que o cadastrado não foi realizado por duplicidade no telefone
   
    
  

    