Feature: Play Song
  Scenario: Play song on the jukebox
    Given song is available
    Then the song plays

    Scenario: Play song on the jukebox
      Given song is not available
      Then User can add song to jukebox


