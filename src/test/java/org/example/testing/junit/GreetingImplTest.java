package org.example.testing.junit;

import org.example.testing.Greeting;
import org.example.testing.GreetingImpl;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

// For eclipse needed!
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.runner.RunWith;
//
//
//@RunWith(JUnitPlatform.class)
public class GreetingImplTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("beforeClass");
        System.out.println("Print");
        // Init Container/DB Connection
        // or Long running task

    }

    @AfterAll
    public static void afterClass() {
        System.out.println("afterClass");
        // Close Init/DB Connection

    }

    @BeforeEach
    public void setup() {
        System.out.println("setup");
        greeting = new GreetingImpl();

    }

    @Test
    @Order(1)
    public void greet_WithValidName_ShouldReturnValidOutput() {
        // fail("Not yet implemented")
        System.out.println("greetShouldRetunAValidOutput");
        String result = greeting.greet("Junit");
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello Junit", result);
    }

    @Test
    @Order(2)
    // JUnit 4 way - @Test(expected = IllegalArgumentException.class)
    public void greet_WithNullName_ShouldThrowException() {
        System.out.println("greetShouldThrowAnException_For_NameIsNull");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeting.greet(null);
        });
    }

    @Test
    @Order(3)
    public void greet_WithBlankName_ShouldThrowException() {
        System.out.println("greetShouldThrowAnException_For_NameIsBlank");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeting.greet("");
        });
    }

    @Test
    @Order(4)
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void sort_WithDescArray() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {3, 2, 1};
        Arrays.sort(a2);
        // Assertions.assertEquals(a1, a2); // org.opentest4j.AssertionFailedError
        Assertions.assertArrayEquals(a1, a2);
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
        greeting = null;
    }
}
// No Failure is Success in Junit
// Test method naming convention: (test)(methodName)_With(InputDesc)_Should(Action)
