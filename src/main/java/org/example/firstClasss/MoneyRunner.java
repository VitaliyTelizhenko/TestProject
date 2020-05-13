package org.example.firstClasss;

import java.util.Set;
import java.util.TreeSet;

public class MoneyRunner {
    public static void main(String[] args) {
       FootballTeam f1 = new FootballTeam(9);
       FootballTeam f2 = new FootballTeam(1);
       FootballTeam f3 = new FootballTeam(3);

       Set<FootballTeam> treeSet = new TreeSet<>((a,b) -> a.getGamesWon().compareTo(b.getGamesWon()));

       treeSet.add(f1);
       treeSet.add(f2);
       treeSet.add(f3);

       for(FootballTeam team : treeSet){
           System.out.println(team);
       }
    }
}
