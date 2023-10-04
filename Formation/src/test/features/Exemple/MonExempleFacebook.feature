@tag
Feature: creation compte facebook 

  @tag1
  Scenario: creation compte facebook  
    Given o ouvrir Navigateurs
    And o ouvrir url "https://www.facebook.com/"
    When o saisir le nom "Hamed"
    And o sasir le prenom "Hamed"
    And o sasir le mail "50930538"
    And o saisir le mot de passe "azerty123456à@"
    And o selectionner le jour de naissance "11"
    And o selectionner le mois "6"
    And o selectionner l annee "1993"
    And o selectionner le genre "h"
    And o cliquer sur creer new compte 
    Then o vérifier la creation d un nouveau compte 