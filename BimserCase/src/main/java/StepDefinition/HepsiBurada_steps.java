package StepDefinition;

import PageObjectModel.AbstractClass;
import PageObjectModel.HepsiBurada_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;
import java.util.Set;

public class HepsiBurada_steps extends AbstractClass {

    private WebDriver driver;

    HepsiBurada_Page HepsiBurada_Page=new HepsiBurada_Page();

    @Given("HepsiBurada sitesini ziyaret eder")
    public void hepsi_burada_sitesini_ziyaret_eder() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Given("Cerez politasini kabul eder")
    public void cerez_politasini_kabul_eder() {
        HepsiBurada_Page.clickCerezKabulEtButton();
    }

    @Given("Urun aramasi yapilir")
    public void urun_aramasi_yapilir() {
        HepsiBurada_Page.sendAramaKutusu();
        HepsiBurada_Page.clickAraButon();
    }

    @Given("Urun secilir ve detay sayfasina gidilir")
    public void urun_secilir_ve_detay_sayfasina_gidilir() {
        HepsiBurada_Page.clickUrun();
    }

    @Given("Urunun sayfasina gittigini dogrular")
    public void urunun_sayfasina_gittigini_dogrular() {

        String urunKontrol= HepsiBurada_Page.SecilenUrunAd();
        System.out.println(HepsiBurada_Page.SecilenUrunAd());

        String firstWin=driver.getWindowHandle();
        String firstWinURL=driver.getCurrentUrl();
        System.out.println("İlk URL: "+ firstWinURL);
        Set<String> windowAllWindows=driver.getWindowHandles();
        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }
        String secWin=driver.getCurrentUrl();
        System.out.println("Güncel URL"+ secWin);

        HepsiBurada_Page.SecilenUrunAd2();

        HepsiBurada_Page.UrunDogrulama(urunKontrol);

    }

    @Given("Degerlendirmeler tabina gidilir")
    public void degerlendirmeler_tabina_gidilir() {
        String firstWin=driver.getWindowHandle();
        String firstWinURL=driver.getCurrentUrl();
       // System.out.println("İlk URL: "+ firstWinURL);
        Set<String> windowAllWindows=driver.getWindowHandles();
        for (String window:windowAllWindows) {
            driver.switchTo().window(window);
        }
        String secWin=driver.getCurrentUrl();
        System.out.println("Güncel URL: "+ secWin);
        HepsiBurada_Page.clickDegerlendirme();

    }

    @Given("Puana gore azalan siralamasi yapilir")
    public void puana_gore_azalan_siralamasi_yapilir() {
        HepsiBurada_Page.clickSirala();
        HepsiBurada_Page.clickPuanSec();
    }

    @When("Ilk yorumun Evet butonuna bastiginda")
    public void ılk_yorumun_evet_butonuna_bastiginda() {
        HepsiBurada_Page.clickTikle();
    }

    @Then("Tesekkur Ederiz yazisi gorulur")
    public void tesekkur_ederiz_yazisi_gorulur() {
        HepsiBurada_Page.yaziDogrulama();

    }
}
