#language: pt
Funcionalidade: Validar login com sucesso

  @Test
Cenario: Validar login com dados cadastrados
    Dado que o usuario está na tela de login
    Quando inserir o CPF 
    E clicar em avançar
    E inserir a senha
    Entao realizar o login com sucesso

