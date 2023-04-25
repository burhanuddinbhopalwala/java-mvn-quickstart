package org.example.testing.junit;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class SpyTest {
    // Spy: Partial or No mock.
    // @Spy  List<String> listSpy = new ArrayList<>();
    @Mock
    ArrayList listMockSpy = new ArrayList();

    @Test
    public void creatingASpyOnArrayList() {
        ArrayList listSpy = spy(ArrayList.class);
        listSpy.add("Ranga");
        listSpy.add("in28Minutes");

        assertEquals(2, listSpy.size());
        assertEquals("Ranga", listSpy.get(0));
        verify(listSpy).add("Ranga");
        verify(listSpy).add("in28Minutes");
    }

    @Test
    public void creatingASpyOnArrayList_overridingSpecificMethods() {
        ArrayList listSpy = spy(ArrayList.class);
        listSpy.add("Ranga");
        listSpy.add("in28Minutes");

        // when(listSpy.size()).thenReturn(-1);
        Mockito.doReturn(-1).when(listSpy).size(); // Prefer this with Spy instead of above!
        assertEquals(-1, listSpy.size());
        assertEquals("Ranga", listSpy.get(0));
    }

    @Test // Preferred way of using SPY using Mock
    public void creatingASpyOnArrayList_overridingSpecificMethodsUsingMock() {
        when(listMockSpy.add("Ranga")).thenCallRealMethod();
        when(listMockSpy.add("in28Minutes")).thenCallRealMethod();
        // when(listMockSpy.get(0)).thenCallRealMethod();

        when(listMockSpy.size()).thenReturn(-1);
        // Mockito.doReturn(-1).when(listSpy).size(); // Use this for SPY only!
        assertEquals(-1, listMockSpy.size());
        assertEquals("Ranga", listMockSpy.get(0));
    }
}
