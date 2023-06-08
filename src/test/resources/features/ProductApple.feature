Feature: ebay product listeme islemleri
  Background: Kullanici URL gider
    Given Kullanici url gider
    When Kullanici signin butonuna tiklar
    And Kullanici "email" girer ve continue tusuna basar
    And Kullanici "password" girer ve continue tusuna basarr
    @Smoke
    Scenario: Apple ürünlerinin listelenmesi
      Given User comes to Electronics
      And The user clicks Apple in the pop-up window
      And The user clicks on the Apple phones and smartphones tab from the left tab
      And The user clicks on the iphone fourteen promax by swiping the upper part to the right
      And Clicks one tb in the Filtering section
      And Clicks purple as color
      When User verifies that the number in the result is the same as the number of output products

