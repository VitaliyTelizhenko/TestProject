package org.example.messageTest;


import org.junit.Test;

import static org.mockito.Mockito.*;

public class MessengerTest {
      private static final String MAIL = "olol@mail.ru";
      private static final String MSG = "Hello";

      @Test
      public void shouldSendMail(){
          Template template = mock(Template.class);
          Client client = mock(Client.class);
          TemplateEngine templateEngine = mock(TemplateEngine.class);
          MailServer mailServer = mock(MailServer.class);

          Messenger messenger = new Messenger(templateEngine, mailServer);

          when(client.getEmail()).thenReturn(MAIL);
          when(templateEngine.prepareMessage(template)).thenReturn(MSG);

          messenger.sendMessage(client, template);

          verify(mailServer).send(MAIL, MSG);
      }
}