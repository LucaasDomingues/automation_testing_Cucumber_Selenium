package com.br.projeto.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BaseTest;


public class SendQuotePage {
	PaginaBase paginaBase = new PaginaBase();
	

	public By infoEmailInput = By.xpath("//input[@id='email']");
	public By infoPhoneInput = By.xpath("//input[@id='phone']");
	public By infoUserNameInput = By.xpath("//input[@id='username']");
	public By passWordInput = By.xpath("//input[@id='password']");
	public By passWordConfirm = By.xpath("//input[@id='confirmpassword']");
	public By sendButton = By.xpath("//button[@id='sendemail']");
	public By confirmButton = By.xpath("//button[@class='confirm']");

	public By messageSuccess = By.xpath("/html/body/div[4]/h2");

	public void checkMessage(String msg, By element) {
		try {
			String resultado = paginaBase.getText(element, true);
			System.out.println(resultado);
			Assert.assertEquals("Sending e-mail success!", resultado);
			System.out.println("Sucesso!");
		} catch (Exception e) {
			System.out.println("Mensagem não encontrada");
		}
	}

	public void sendQuote() throws Exception {

		paginaBase.sendKeys(infoEmailInput, "teste1@teste.com");
		paginaBase.sendKeys(infoPhoneInput, "11997981327");
		paginaBase.sendKeys(infoUserNameInput, "Teste");
		paginaBase.sendKeys(passWordInput, "Teste2021");
		paginaBase.sendKeys(passWordConfirm, "Teste2021");
		paginaBase.click(sendButton);
		paginaBase.checkMessage("Sending e-mail success!", messageSuccess);
		Thread.sleep(3000);
		paginaBase.click(confirmButton);
		Thread.sleep(5000);
		BaseTest.afterClass();
	}
}
