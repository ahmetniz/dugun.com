Feature: kullanıcıların chat yöntemi ile firma sahipleriyle iletişime geçmeleri

  Background: Kullanıcı chat bölümüne gelir
    When kullanıcı giriş sayfasına gider
    And Giriş yap/üye ol butonuna tıklar
    Then Geçerli e mail yazar
    And Geçerli şifre yazar
    Then Giriş yap butonuna tıklar
    Then Mesajlar bölümüne tıklar

    Scenario: Kullanıcı başarılı bir şekilde mesaj yollar
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı mesaj yazma bölümüne tıklar
      Then kullanıcı herhangi bır mesaj yazar
      Then kullanıcı gönder tuşuna basar
      Then kullanıcı göderildi uyarısını görür

    Scenario: kullanıcı başarısız bir şekilde mesaj yollar
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı mesaj yazma bölümüne tıklar
      Then kullanıcı herhangi bır mesaj yazar
      Then kullanıcı gönder tuşuna basar
      And kullanıcı gönderilemedi uyarısını görür

    Scenario: kullanıcı sesli mesaj yollar
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı ses gönderme butonunu basılı tutar
      Then kullanıcı ses gönderme butonunu bırakır
      And kullanıcı gönder tuşuna basar
      Then sesli mesaj alıcıya ulaşır

    Scenario: kullanıcı fotoğraf yollar
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı fotoğraf gönderme butonuna tıklar
      Then kullanıcı açılan bölümden fotoğraf seçer
      And kullanıcı gönder butonuna tıklayarak fotoğrafı yollar

    Scenario: kullanıcı mesaj siler
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı mesaj yazma bölümüne tıklar
      Then kullanıcı herhangi bır mesaj yazar
      Then kullanıcı gönder tuşuna basar
      And kullanıcı gönderdiği mesajın üzerine tıklar
      Then kullanıcı açılan bölümden mesajı sil butonuna tıklar
      And kullanıcı başarılı şekilde mesajı siler

    Scenario: kullanıcı tüm mesajlaşmayı siler
      When kullanıcı kullanıcın yanındaki dropdown butonuna basar
      And kullanıcı mesajları sil butonuna tıklar
      Then Kullanıcı mesajları başarılı şekilde siler

    Scenario: kullanıcı firma sahibini şikayet eder
      When kullanıcı kullanıcın yanındaki dropdown butonuna basar
      And kullanıcı firma sahibini şikayet et butonuna tıklar
      And kullanıcı açılan bölümde şikayet nedenini yazar
      And kullanıcı şikayeti gönder butonuna tıklar
      Then kullanıcı şikayetiniz alınmıştır mesajını görür

    Scenario: kullanıcı mesaj atmak istediği firmayı arama barına yazarak bulur
      When kullanıcı arama butonuna tıklar
      Then kullanıcı firma ismini yazar
      And kullanıcı ara butonuna tıklar
      Then kullanıcı mesaj atmak istediği firmayı görür

    Scenario: kullanıcı firma ile eski mesajlaşmalarını okumak ister
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      And kullanıcı yukarı doğru kaydırır
      Then kullanıcı eski mesajlaşmaları görür

    Scenario: kullanıcı mesajlaşırken firmanın ismine tıklayarak firmanın profiline ulaşabilir
      When Kullanıcı mesaj atmak istediği kişiye tıklar
      Then kullanıcı firma ismi üzerine tıklar
      And kullanıcı firma profilini görür





