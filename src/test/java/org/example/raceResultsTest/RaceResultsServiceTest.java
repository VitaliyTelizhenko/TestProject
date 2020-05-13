package org.example.raceResultsTest;

import org.example.raceResults.Client;
import org.example.raceResults.Message;
import org.example.raceResults.RaceResultsService;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RaceResultsServiceTest {

    RaceResultsService raceResults = new RaceResultsService();
    Client clientA = mock(Client.class, "ClientA");
    Client clientB = mock(Client.class, "ClientB");
    Message message = mock(Message.class);

   @Test
    public void subscribedClientShouldReceiveMessage(){

        raceResults.addSubscriber(clientA);
        raceResults.send(message);

        verify(clientA).receive(message);
    }

    @Test
    public void allSubscribedClientsShouldReceiveMessage(){

        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);

        raceResults.send(message);

        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }

    @Test
    public void SubscriberCanSubscribeOnlyOnce(){

        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientA);

        raceResults.send(message);

        verify(clientA).receive(message);
    }

}
