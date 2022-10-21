package com.duguncom.step_definitions;

import com.duguncom.pages.LoginPage;
import com.duguncom.utilities.ConfigurationReader;
import com.duguncom.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class duguncomStepdefs {

    LoginPage loginPage = new LoginPage();
    @When("kullanıcı giriş sayfasına gider")
    public void kullanıcıGirişSayfasınaGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("Giriş yap-üye ol butonuna tıklar")
    public void girişYapÜyeOlButonunaTıklar() {
        loginPage.loginButton.click();
    }

    @Then("Geçerli e mail yazar")
    public void geçerliEMailYazar() {
        loginPage.emailBox.sendKeys("valid Email");
    }

    @And("Geçerli şifre yazar")
    public void geçerliŞifreYazar() {
        loginPage.passwordBox.sendKeys("valid password");
    }

    @Then("Giriş yap butonuna tıklar")
    public void girişYapButonunaTıklar() {
        loginPage.submitButton.click();
    }

    @Then("Mesajlar bölümüne tıklar")
    public void mesajlarBölümüneTıklar() {
    }

    @When("Kullanıcı mesaj atmak istediği kişiye tıklar")
    public void kullanıcıMesajAtmakIstediğiKişiyeTıklar() {
    }

    @And("kullanıcı mesaj yazma bölümüne tıklar")
    public void kullanıcıMesajYazmaBölümüneTıklar() {
    }

    @Then("kullanıcı herhangi bır mesaj yazar")
    public void kullanıcıHerhangiBırMesajYazar() {
    }

    @Then("kullanıcı gönder tuşuna basar")
    public void kullanıcıGönderTuşunaBasar() {
    }

    @Then("kullanıcı göderildi uyarısını görür")
    public void kullanıcıGöderildiUyarısınıGörür() {
    }

    @And("kullanıcı gönderilemedi uyarısını görür")
    public void kullanıcıGönderilemediUyarısınıGörür() {
    }

    @And("kullanıcı ses gönderme butonunu basılı tutar")
    public void kullanıcıSesGöndermeButonunuBasılıTutar() {
    }

    @Then("kullanıcı ses gönderme butonunu bırakır")
    public void kullanıcıSesGöndermeButonunuBırakır() {
    }

    @Then("sesli mesaj alıcıya ulaşır")
    public void sesliMesajAlıcıyaUlaşır() {
    }

    @And("kullanıcı fotoğraf gönderme butonuna tıklar")
    public void kullanıcıFotoğrafGöndermeButonunaTıklar() {
    }

    @Then("kullanıcı açılan bölümden fotoğraf seçer")
    public void kullanıcıAçılanBölümdenFotoğrafSeçer() {
    }

    @And("kullanıcı gönder butonuna tıklayarak fotoğrafı yollar")
    public void kullanıcıGönderButonunaTıklayarakFotoğrafıYollar() {
    }

    @And("kullanıcı gönderdiği mesajın üzerine tıklar")
    public void kullanıcıGönderdiğiMesajınÜzerineTıklar() {
    }

    @Then("kullanıcı açılan bölümden mesajı sil butonuna tıklar")
    public void kullanıcıAçılanBölümdenMesajıSilButonunaTıklar() {
    }

    @And("kullanıcı başarılı şekilde mesajı siler")
    public void kullanıcıBaşarılıŞekildeMesajıSiler() {
    }

    @When("kullanıcı kullanıcın yanındaki dropdown butonuna basar")
    public void kullanıcıKullanıcınYanındakiDropdownButonunaBasar() {
    }

    @And("kullanıcı mesajları sil butonuna tıklar")
    public void kullanıcıMesajlarıSilButonunaTıklar() {
    }

    @Then("Kullanıcı mesajları başarılı şekilde siler")
    public void kullanıcıMesajlarıBaşarılıŞekildeSiler() {
    }

    @And("kullanıcı firma sahibini şikayet et butonuna tıklar")
    public void kullanıcıFirmaSahibiniŞikayetEtButonunaTıklar() {
    }

    @And("kullanıcı açılan bölümde şikayet nedenini yazar")
    public void kullanıcıAçılanBölümdeŞikayetNedeniniYazar() {
    }

    @And("kullanıcı şikayeti gönder butonuna tıklar")
    public void kullanıcıŞikayetiGönderButonunaTıklar() {
    }

    @Then("kullanıcı şikayetiniz alınmıştır mesajını görür")
    public void kullanıcıŞikayetinizAlınmıştırMesajınıGörür() {
    }

    @When("kullanıcı arama butonuna tıklar")
    public void kullanıcıAramaButonunaTıklar() {
    }

    @Then("kullanıcı firma ismini yazar")
    public void kullanıcıFirmaIsminiYazar() {
    }

    @And("kullanıcı ara butonuna tıklar")
    public void kullanıcıAraButonunaTıklar() {
    }

    @Then("kullanıcı mesaj atmak istediği firmayı görür")
    public void kullanıcıMesajAtmakIstediğiFirmayıGörür() {
    }

    @And("kullanıcı yukarı doğru kaydırır")
    public void kullanıcıYukarıDoğruKaydırır() {
    }

    @Then("kullanıcı eski mesajlaşmaları görür")
    public void kullanıcıEskiMesajlaşmalarıGörür() {
    }

    @Then("kullanıcı firma ismi üzerine tıklar")
    public void kullanıcıFirmaIsmiÜzerineTıklar() {
    }

    @And("kullanıcı firma profilini görür")
    public void kullanıcıFirmaProfiliniGörür() {
    }
}
