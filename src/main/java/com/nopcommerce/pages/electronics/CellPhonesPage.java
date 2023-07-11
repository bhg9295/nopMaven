package com.nopcommerce.pages.electronics;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhonesTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellPhoneProductCategory = (By.xpath("//h1[normalize-space()='Cell phones']"));
    By listViewTab = (By.cssSelector("a[title='List']"));
    By specificProduct = (By.xpath("//a[normalize-space()='Nokia Lumia 1020']"));
    By productName = (By.xpath("//h1[normalize-space()='Nokia Lumia 1020']"));
    By price = (By.cssSelector("#price-value-20"));
    By quantity = By.cssSelector("#product_enteredQuantity_20");
    By addToCartBtn = By.cssSelector("#add-to-cart-button-20");
    By productAddedNotification = By.cssSelector(".content");
    By closeBtn = By.cssSelector("span[title='Close']");


    public void clickOnElectronicsTab() {
        clickOnElement(electronicsTab);
    }

    public void clickOnCellPhonesTab() {
        clickOnElement(cellPhonesTab);
    }

    public String getCellPhonesText() {
        return getTextFromElement(cellPhoneProductCategory);
    }

    public void clickOnListViewTab(){
        clickOnElement(listViewTab);
    }

    public void clickOnSpecificProduct(){
        clickOnElement(specificProduct);
    }

    public String getProductName(){
        return getTextFromElement(productName);
    }

    public String getProductPrice(){
        return getTextFromElement(price);
    }

    public void changeQuantity(){
        //clearWebElement(quantity);
        sendTextToElement(quantity,"2");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartBtn);
    }

    public String getProductAddedNotification(){
        return getTextFromElement(productAddedNotification);
    }

    public void clickOnCloseButton(){
        clickOnElement(closeBtn);
    }

}
