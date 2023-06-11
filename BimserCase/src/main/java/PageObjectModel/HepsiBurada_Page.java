package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.Set;

public class HepsiBurada_Page extends AbstractClass{

    WebDriver driver;

    public HepsiBurada_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    private WebElement cerezKabulEtButton;
    public void clickCerezKabulEtButton(){
        clickFunction(cerezKabulEtButton);
    }

    @FindBy(xpath = "//input[@class=\"theme-IYtZzqYPto8PhOx3ku3c\"]")
    private WebElement aramaKutusu;
    public void sendAramaKutusu(){
        sendKeysFunction(aramaKutusu,"Mouse");
    }

    @FindBy(xpath = "//div[@class=\"searchBoxOld-yDJzsIfi_S5gVgoapx6f\"]")
    private WebElement araButon;
    public void clickAraButon(){
        clickFunction(araButon);
    }

    @FindBy(xpath = "//li[@id=\"i1\"]")
    private WebElement urun;
    public void clickUrun(){
        clickFunction(urun);
    }

    @FindBy(xpath = "//li[@id=\"i1\"]//h3[@data-test-id=\"product-card-name\"]")
    private WebElement urunAD;
    public  String SecilenUrunAd(){
        String ad=urunAD.getText();
        //System.out.println("Seçilen ürün: " + ad);
        return ad;
    }

    @FindBy(xpath = "//h1[@id=\"product-name\"]")
    private WebElement urunAD2;
    public void SecilenUrunAd2(){
        String ad2=urunAD2.getText();
        System.out.println("Açılan ürün: " + ad2);
    }


    public void UrunDogrulama(String urunD){
       Assertion(urunAD2,urunD);
    }


    @FindBy(xpath = "//a[@data-bind=\"css: {expanded : isProductReviewVisible()}, click: showReviewsTab, attr: { 'data-hbus' : userInformation() && userInformation().userId && isEventReady() ? productDetailHbus('CommentNumberClick'): ''}\"]")
    private WebElement degerlendirme;
    public void clickDegerlendirme(){
        clickFunction(degerlendirme);
    }

    @FindBy(xpath = "//div[@class=\"hermes-Sort-module-Zwr_VRf_e4tZXl5J1PgT\"]")
    private WebElement sirala;
    public void clickSirala(){
        clickFunction(sirala);
    }


    @FindBy(xpath = "//div[text()='Puana göre azalan']")
    private WebElement puansec;
    public void clickPuanSec(){
        clickFunction(puansec);
    }

    @FindBy(xpath = "//div[@class=\"thumbsUp hermes-ReviewCard-module-lOsa4wAwncdp3GgzpaaV\"]")
    private WebElement tikle;
    public void clickTikle(){
        clickFunction(tikle);
    }

    @FindBy(xpath = "//span[text()='Teşekkür Ederiz.']")
    private WebElement yazi;
    public void yaziDogrulama(){
        Assertion(yazi,"Teşekkür Ederiz.");

    }





}
