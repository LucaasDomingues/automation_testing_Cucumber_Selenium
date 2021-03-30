package com.br.projeto.pages;

import org.openqa.selenium.By;

public class ProductDataPage {
	PaginaBase paginaBase = new PaginaBase();
	
	public By startDateInput = By.xpath("//input[@id='startdate']");
	public By insurenceSumSelect = By.xpath("//*[@id='insurancesum']");
	public By meritratingSelect = By.xpath("//select[@id='meritrating']");
	public By damageSelect = By.xpath("//select[@id='damageinsurance']");
	public By optionalProductCheck = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
	public By courtesyCarSelect = By.xpath("//select[@id='courtesycar']");
	public By nextBtn = By.xpath("//button[@id='nextselectpriceoption']");
	
	public void ProductData() throws Exception {
		paginaBase.sendKeys(startDateInput, "08/11/2021");
		paginaBase.select(insurenceSumSelect, "3.000.000,00");
		paginaBase.select(meritratingSelect, "Super Bonus");
		paginaBase.select(damageSelect, "Full Coverage");
		paginaBase.click(optionalProductCheck);
		paginaBase.select(courtesyCarSelect, "Yes");
		paginaBase.click(nextBtn);
	}

}
