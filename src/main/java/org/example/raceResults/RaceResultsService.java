package org.example.raceResults;

import java.util.ArrayList;
import java.util.List;

public class RaceResultsService {

    private List<Client> clients = new ArrayList<>();

    public void addSubscriber(Client client) {
        if(clients.contains(client)) return;
        clients.add(client);
    }

    public void send(Message message) {
        for(Client client : clients){
            client.receive(message);
        }
    }
}
