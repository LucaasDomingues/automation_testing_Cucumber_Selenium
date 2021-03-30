@preencheFormulario
Feature: Solicitacao de Seguro Veicular
  Eu como usuario desejo solicitar o seguro de meu veiculo
  efetuar o preenchimento dos dados do veiculo, seguro e enviar e-mail 
  para solicitacao.

  Scenario: Preencher dados e enviar solicitacao
    Given que eu quero preencher formulario com os dados do veiculo
    And inserir dados do seguro
    When e ir para configuracao de alta sobre a solicitacao
    Then realizar o envio da solicitacao e validar mensagem de sucesso
    
