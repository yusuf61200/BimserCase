Feature: HepsiBurada Test

  Scenario: HepsiBurada urun degerlendirme

    Given HepsiBurada sitesini ziyaret eder
    And Cerez politasini kabul eder
    And Urun aramasi yapilir
    And Urun secilir ve detay sayfasina gidilir
    And Urunun sayfasina gittigini dogrular
    And Degerlendirmeler tabina gidilir
    And Puana gore azalan siralamasi yapilir
    When Ilk yorumun Evet butonuna bastiginda
    Then Tesekkur Ederiz yazisi gorulur
