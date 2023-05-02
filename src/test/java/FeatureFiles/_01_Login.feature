# Senaryo
  # siteye git /> test case -> adım
  # login bilgilerini al
  # siteye girdiğini doğrula

  # DİKKAT: Scenario,Feature YANINDAKİ " : " Scenario VE Feature YAZISI İLE BİTİŞİK OLMALI YOKSA PROGRAM ÇALIŞMAZ!!!

  Feature: Login Functionality

    @SmokeTest @Regression
    Scenario: Login with valid username and password

      Given Navigate to Campus
      When Enter username and password and click login button
      Then User should login successfully