Feature: Play Song
  Scenario: Play song on the jukebox
    Given song is available
    When  song is played
    Then the song plays

  Scenario: Play song on the jukebox
    Given song is not available
    When song is searched
    Then User can add song to jukebox


