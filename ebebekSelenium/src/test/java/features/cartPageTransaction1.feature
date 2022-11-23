Feature: Maximum satış adeti test


  Scenario: Sepete bir ürün eklenir ve sepet sayfasında ard arda arttır butonuna tıklanır

    Given Anasayfa açılır
    And Anasayfadaki ilk ürün sepete eklenir
    And Sepete gidilir
    Then Sepetteki ürün ard arda arttırma işlemine tabi kalır
    Then Ürün adetinin maximum satış adetine düştüğü kontrol edilir