Feature: Alışveriş tamamlama


  Scenario: Sepete bir ürün eklenir ve sepet sayfasında alışverişi tamamla butonuna basılıp üye girişi yapılır


    Given Anasayfa açılır
    And Anasayfadaki ilk ürün sepete eklenir
    And Sepete gidilir
    And Alışverişi Tamamla butonuna basılır
    Then üyelik kabininden Eposta seçilir
    And Epsosta adresi girilir
    And Giriş yap üye ol butonuna tıklanır
    Then Şifre girilir
    And Giriş yap butonuna tıklanır
    Then  "https://www.e-bebek.com/checkout/shipping-address" yada "https://www.e-bebek.com/cart" adresinde olunup olunmadığı kontrol edilir
