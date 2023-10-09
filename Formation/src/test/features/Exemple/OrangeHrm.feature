@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: connecter avec compte valide et 2 compte invalide
    Given ouvrir le site "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When saisir user "<user>"
    And saisir mot de passse "<mot de passe>"
    And cliquer sur le bouton se connecter
    Then je vérifie si le compte s'ouvre avec url "<messagee>"

    Examples: 
      | user  | mot de passe | messagee            |
      | name1 | dbfb         | Invalid credentials |
      | name2 | dxb          | Invalid credentials |
      | Admin | admin123     | Joa Caceres         |
