package com.br.projeto.pages;

import org.openqa.selenium.By;

public class PriceOptionPage {
	PaginaBase paginaBase = new PaginaBase();
	
	public By priceOptionSelect = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]");
	public By nextQuoteBtn = By.xpath("//button[@id='nextsendquote']");
	
	
	public void selectionOptionPrice () throws Exception {
		
		paginaBase.click(priceOptionSelect);
		paginaBase.scrollToElement(nextQuoteBtn);
		paginaBase.click(nextQuoteBtn);
	}

}
