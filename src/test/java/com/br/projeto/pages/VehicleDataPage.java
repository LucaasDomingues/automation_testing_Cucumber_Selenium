package com.br.projeto.pages;

import org.openqa.selenium.By;

import core.DriverSingleton;

public class VehicleDataPage {
	
	PaginaBase paginaBase = new PaginaBase();
	
	public By makeSelect = By.xpath("//select[@id='make']");
	public By modelSelect = By.xpath("//select[@id='model']");
	public By cylindercapacityInput = By.xpath("//input[@id='cylindercapacity']");
	public By enginePerformanceInput = By.xpath("//input[@id='engineperformance']");
	public By dataManufactureInput = By.xpath("//input[@id='dateofmanufacture']");
	public By numberOfSeatsSelect = By.xpath("//select[@id='numberofseats']");
	public By rightHandDriveRadio = By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]");
	public By SeatsMotorCycleSelect = By.xpath("//select[@id='numberofseatsmotorcycle']");
	public By fuelTypeSelect = By.xpath("//select[@id='fuel']");
	public By payLoadInput = By.xpath("//input[@id='payload']");
	public By totalWeightInput = By.xpath("//input[@id='totalweight']");
	public By listPriceInput = By.xpath("//input[@id='listprice']");
	public By plateNumberInput = By.xpath("//input[@id='licenseplatenumber']");
	public By annualMillegaeInput = By.xpath("//input[@id='annualmileage']"); 
	public By clickButton = By.xpath("//button[@id='nextenterinsurantdata']");
	
	
	public void preencherFormularioVeiculo() throws Exception {
		DriverSingleton.navegar("http://sampleapp.tricentis.com/101/app.php");
		paginaBase.select(makeSelect, "Audi");
		paginaBase.select(modelSelect, "Scooter");
		paginaBase.sendKeys(cylindercapacityInput, "850");
		paginaBase.sendKeys(enginePerformanceInput, "1000");
		paginaBase.sendKeys(dataManufactureInput, "11/08/2009");
		paginaBase.select(numberOfSeatsSelect, "2");
		paginaBase.click(rightHandDriveRadio);
		paginaBase.select(SeatsMotorCycleSelect, "3");
		paginaBase.select(fuelTypeSelect, "Petrol");
		paginaBase.sendKeys(payLoadInput, "80");
		paginaBase.sendKeys(totalWeightInput, "200");
		paginaBase.sendKeys(listPriceInput, "20000");
		paginaBase.sendKeys(plateNumberInput, "HBO7802");
		paginaBase.sendKeys(annualMillegaeInput, "1000");
		paginaBase.click(clickButton);
		
	}
	
	
	

}
