@sm
Feature: creation d'une compte facebook avec des donnees valide et invalide

  @tag2
  Scenario Outline: creation d un compte facebook avec des données valide et invalide
    Given ouvrir le navigateur choisi
    And se connecterr au site "https://www.facebook.com/"
    When cliquer sur le bouton créer nouveau compte
    And saisir votre prénom "<prenom>"
    And saisir votre nom de famille "<nom de famille>"
    And entrer votre num mobile ou adresse mail "<num mobil>"
    And saisir votre mot de passe "<mot de passe>"
    And choisir votre jour de naissance "<jour de naissance>"
    And choisir votre mois de naissance "<mois de naissance>"
    And choisir votre annee de naissance "<annee de naissance>"
    And choisir votre genre "<genre>"
    And cliquer sur s'inscrire
    Then vérifier  la creation du compte (oui pour données valide // et nom pour invalide)"<message>"

    Examples: 
      | prenom | nom de famille | num mobil | mot de passe | jour de naissance | mois de naissance | annee de naissance | genre | message                                                                          |
      | hamed  | mhenni         |  50930538 | j@kKmlonn021 |                11 |                 6 |               1993 | homme | https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2F |
      | vds    | vsv            | Fail vs   | vv@@lmPP152  |                 2 |                 2 |               2001 | femme | https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2F |
