package com.br.projeto.pages;

import org.openqa.selenium.By;

public class InsurantDataPage {
	PaginaBase paginaBase = new PaginaBase();
	
	public By firstNameInput = By.xpath("//input[@id='firstname']");
	public By lastNameInput = By.xpath("//input[@id='lastname']");
	public By birthDateInput = By.xpath("//input[@id='birthdate']");
	public By generoRadioButton = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]");
	public By adressInput = By.xpath("//input[@id='streetaddress']");
	public By countrySelect = By.xpath("//select[@id='country']");
	public By zipCodeInput = By.xpath("//input[@id='zipcode']");
	public By cityInput = By.xpath("//input[@id='city']");
	public By occupationSelect = By.xpath("//select[@id='occupation']");
	public By hobbiesSelect = By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[5]");
	public By nextBtn = By.xpath("//button[@id='nextenterproductdata']");
	
	
	public void InsurantDataFormulario() throws Exception {
		paginaBase.sendKeys(firstNameInput, "Jose");
		paginaBase.sendKeys(lastNameInput, "Alencar");
		paginaBase.sendKeys(birthDateInput,"08/02/1995");
		paginaBase.click(generoRadioButton);
		paginaBase.sendKeys(adressInput,"Av Jose Julio, 155, Tibery");
		paginaBase.select(countrySelect, "Brazil");
		paginaBase.sendKeys(zipCodeInput, "08598100");
		paginaBase.sendKeys(cityInput, "São Paulo");
		paginaBase.select(occupationSelect, "Employee");
		paginaBase.click(hobbiesSelect);
		paginaBase.click(nextBtn);
	}
	
	

}
