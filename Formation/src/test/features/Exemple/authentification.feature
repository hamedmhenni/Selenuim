
@tag
Feature: Authentification
  en tands que admin je veux m authentifier

  @tag1
  Scenario: Authentification valide 
    Given ouvrir Navigateur
    And ouvrir url
    When saisir username
    And sasir mdp
    And cliquer sur le bouton login
    Then vérifier le nom du profil
   
 