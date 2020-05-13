package org.example.MockitoProject;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class MockitoDefaultTest {
    Car myFerrari = mock(Car.class);

    @Test
    public void testCarIsACar(){
        assertTrue(myFerrari instanceof Car);
    }
    @Test
    public void testWhen(){
        assertFalse(myFerrari.needsFuel());
        when(myFerrari.needsFuel()).thenReturn(true);
        assertTrue(myFerrari.needsFuel());
    }
    @Test(expected = RuntimeException.class)
    public void testException(){
        when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
        myFerrari.needsFuel();
    }
    @Test
    public void testVerification(){
        myFerrari.driveTo("Samara");
        verify(myFerrari).driveTo("Samara");
    }
}
