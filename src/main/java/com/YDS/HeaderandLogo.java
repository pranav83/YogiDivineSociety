package com.YDS;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderandLogo extends BaseMain {

    public HeaderandLogo(){
        PageFactory.initElements(driver,this);
    }
   @FindBy(xpath = "//div[@class='col-sm-12']//a//img")
    private WebElement linkLOgo;
    @FindBy(xpath = "//h1[contains(text(),'YOGI DIVINE SOCIETY - UK')]")
    private WebElement text_YDSUK;
   @FindBy(xpath = "//a[contains(text(),'ABOUT US')]")
   private WebElement linkAboutUs;
    @FindBy(xpath = "//h2[contains(text(),'About Us')]")
    private WebElement text_AboutUS;
    @FindBy(xpath = "//a[contains(text(),'CENTRES')]")
    private WebElement linkCenters;
    @FindBy(xpath = "//h2[contains(text(),'Centres')]")
    private WebElement text_Centers;
    @FindBy(xpath = "//a[contains(text(),'EVENTS')]")
    private WebElement linkEvents;
    @FindBy(xpath = "//h2[contains(text(),'Events')]")
    private WebElement text_Events;
    @FindBy(xpath = "//a[contains(text(),'MEDIA GALLERY')]")
    private WebElement linkMediaGallery;
    @FindBy(xpath = "//h2[contains(text(),'Media')]")
    private WebElement text_SundaySabha;
    @FindBy(xpath = "//a[contains(text(),'ACTIVITIES')]")
    private WebElement linkActivities;
    @FindBy(xpath = "//h2[contains(text(),'Activities')]")
    private WebElement text_Activites;
    @FindBy(xpath = "//a[contains(text(),'UPASANA')]")
    private WebElement linkUpsana;
    @FindBy(xpath = "//h2[contains(text(),'Upasana')]")
    private WebElement text_Upasna;
    @FindBy(xpath = "//a[@class='btn donate']")
    private WebElement btnDonation;
    @FindBy(xpath = "//h2[contains(text(),'Donating to us')]")
    private WebElement text_Donation;

    public void navigateTo(){
        driver.get("https://www.ydsuk.org/");
    }
    public boolean verifyLogo(){
        Assert.assertTrue(linkLOgo.isDisplayed());
        return true;
    }
    public boolean verifyText(){
        Assert.assertTrue(text_YDSUK.isDisplayed());
        return true;
    }
    public void aboutsLink(){
        linkAboutUs.click();
    }
    public boolean textAboutUs(){
        Assert.assertTrue(text_AboutUS.isDisplayed());
        return true;
    }
    public void linkCenter(){
        driver.navigate().back();
        linkCenters.click();
    }
    public boolean textCenters(){
        Assert.assertTrue(text_Centers.isDisplayed());
        return true;
    }
    public void LinkEvents(){
        driver.navigate().back();
        linkEvents.click();
    }
    public boolean text_Events(){
        Assert.assertTrue(text_Events.isDisplayed());
        return true;
    }
    public void linkMediaGallery()  {
        driver.navigate().back();
        linkMediaGallery.click();

    }
    public boolean text_SundaySabha()  {
        Assert.assertTrue(text_SundaySabha.isDisplayed());
        return true;
    }
    public void linkActivities(){
        driver.navigate().back();
        linkActivities.click();
    }
    public boolean text_Activites(){
        Assert.assertTrue(text_Activites.isDisplayed());
        return true;
    }
    public void linkUpsana(){
        driver.navigate().back();
        linkUpsana.click();
    }
    public boolean text_Upasna(){
        Assert.assertTrue(text_Upasna.isDisplayed());
        return true;
    }
    public void btnDonation(){
        driver.navigate().back();
        btnDonation.click();
    }
    public boolean text_Donation(){
        Assert.assertTrue(text_Donation.isDisplayed());
        return true;
    }
















}
