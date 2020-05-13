package org.example.firstClasss;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class FootballTeamTest {

    @ParameterizedTest
    @ValueSource(ints = {0,1,9,8})
    public void constructorShouldSetGamesWon(Integer games){
         FootballTeam footballTeam = new FootballTeam(games);
         assertEquals(games, footballTeam.getGamesWon());
    }
}
