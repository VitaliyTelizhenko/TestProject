package org.example.firstClasss;

import java.util.Objects;

public class FootballTeam {
    private Integer gamesWon;

    public FootballTeam(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public Integer getGamesWon() {
        return gamesWon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballTeam that = (FootballTeam) o;
        return Objects.equals(gamesWon, that.gamesWon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gamesWon);
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "gamesWon=" + gamesWon +
                '}';
    }
}
