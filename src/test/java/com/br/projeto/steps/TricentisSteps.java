package com.br.projeto.steps;

import com.br.projeto.pages.InsurantDataPage;
import com.br.projeto.pages.PaginaBase;
import com.br.projeto.pages.PriceOptionPage;
import com.br.projeto.pages.ProductDataPage;
import com.br.projeto.pages.SendQuotePage;
import com.br.projeto.pages.VehicleDataPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TricentisSteps {


	VehicleDataPage vehicleDataPage = new VehicleDataPage();
	InsurantDataPage insurantDataPage = new InsurantDataPage();
	ProductDataPage productDataPage = new ProductDataPage();
	PriceOptionPage priceOptionPage = new PriceOptionPage();
	SendQuotePage sendQuotePage = new SendQuotePage();

	PaginaBase paginaBase = new PaginaBase();
	
	@Given("^que eu quero preencher formulario com os dados do veiculo$")
	public void preencherDadosVeiculo() throws Throwable {
		vehicleDataPage.preencherFormularioVeiculo();
	   
	}

	@Given("^inserir dados do seguro$")
	public void inserirDadosDoSeguro() throws Throwable {
		insurantDataPage.InsurantDataFormulario();
	    
	}

	@When("^e ir para configuracao de alta sobre a solicitacao$")
	public void configurarAltaCotacao() throws Throwable {
		productDataPage.ProductData();
		priceOptionPage.selectionOptionPrice();
	    
	}

	@Then("^realizar o envio da solicitacao e validar mensagem de sucesso$")
	public void enviarCotacao() throws Throwable {
		sendQuotePage.sendQuote();
	   
	}
	
}
