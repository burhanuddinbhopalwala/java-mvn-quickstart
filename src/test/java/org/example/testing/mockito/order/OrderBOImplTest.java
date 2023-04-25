package org.example.testing.mockito.order;

import org.example.testing.mockito.order.bo.OrderBOImpl;
import org.example.testing.mockito.order.bo.exception.BOException;
import org.example.testing.mockito.order.dao.OrderDAOImpl;
import org.example.testing.mockito.order.dto.Order;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
// From Junit 5 allows mocking functionality to create the mocks.
public class OrderBOImplTest {
    private static final int ORDER_ID = 123;
    @Rule // For multiple JUnit Runner
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    OrderDAOImpl daoMock;

    @InjectMocks
    OrderBOImpl orderBOImpl;
    // OrderBOImpl orderBOImpl = new OrderBOImpl(daoMock, restMock);

    // @Captor
    // For Argument Capture

    private Order order;

    @BeforeEach
    public void setup() {
        // MockitoAnnotations.initMocks(this); // Deprecated to scan mock and init. Use @ExtendWith(MockitoExtension.class)
        this.order = new Order();
    }

    @Test
    public void placeOrder_ShouldCreateAnOrder() throws SQLException, BOException {
        // Arrange - Given
        when(daoMock.create(any(Order.class))).thenReturn(new Integer(1));
        // given(dao.create(any(Order.class))).willReturn(new Integer(1));

        // Act - When
        boolean result = orderBOImpl.placeOrder(this.order);

        // Assert - Then
        // assertThat(result, is(true));
        assertTrue(result);
        verify(daoMock, atLeast(1)).create(order);
        // times, never etc.
    }

    @Test
    public void placeOrder_ShouldNotCreateAnOrder() throws SQLException, BOException {
        when(daoMock.create(this.order)).thenReturn(new Integer(0));

        boolean result = orderBOImpl.placeOrder(this.order);

        assertFalse(result);
        verify(daoMock).create(this.order);

    }

    @Test
    public void placeOrder_ShouldThrowBOException() throws SQLException, BOException {
        when(daoMock.create(any(Order.class))).thenThrow(SQLException.class);
        Assertions.assertThrows(BOException.class, () -> {
            orderBOImpl.placeOrder(this.order);
        });
    }

    @Test
    public void cancelOrder_ShouldCancelTheOrder() throws SQLException, BOException {
        when(daoMock.read(anyInt())).thenReturn(this.order);
        when(daoMock.update(this.order)).thenReturn(1);

        boolean result = orderBOImpl.cancelOrder(123);

        assertTrue(result);
        verify(daoMock).read(anyInt());
        verify(daoMock).update(this.order);

    }

    @Test
    public void cancelOrder_ShouldNotCancelTheOrder() throws SQLException, BOException {
        when(daoMock.read(ORDER_ID)).thenReturn(this.order);
        when(daoMock.update(this.order)).thenReturn(0);
        boolean result = orderBOImpl.cancelOrder(123);

        assertFalse(result);
        verify(daoMock).read(ORDER_ID);
        verify(daoMock).update(this.order);

    }

    @Test
    public void cancelOrder_ShouldThrowABOExceptionOnRead() throws SQLException, BOException {
        when(daoMock.read(anyInt())).thenThrow(SQLException.class);
        Assertions.assertThrows(BOException.class, () -> {
            orderBOImpl.cancelOrder(ORDER_ID);
        });
    }

    @Test
    public void cancelOrder_ShouldThrowABOExceptionOnUpdate() throws SQLException, BOException {
        when(daoMock.read(ORDER_ID)).thenReturn(this.order);
        when(daoMock.update(this.order)).thenThrow(SQLException.class);
        Assertions.assertThrows(BOException.class, () -> {
            orderBOImpl.cancelOrder(ORDER_ID);
        });
    }

    @Test
    public void deleteOrder_ShouldDeleteTheOrder() throws SQLException, BOException {
        when(daoMock.delete(ORDER_ID)).thenReturn(1);
        boolean result = orderBOImpl.deleteOrder(ORDER_ID);
        assertTrue(result);
        verify(daoMock).delete(ORDER_ID);
    }

    @AfterEach
    public void teardown() {
        this.order = null;
    }

}

// System Under Test (SUT) is the code to write the unit tests for
// STUB (Setting expectations) >> Mock (Dynamic stubbing) {Default is called as nice mock!}
// Matcher with hard code value does not work! when(mockClass.method(anyInt(), 5).thenReturn(...) => fails!
// BDD: Behaviour Driven Development (Given >> When >> Then)
// Argument Capture: https://www.udemy.com/course/mockito-tutorial-with-junit-examples/learn/lecture/5678768#overview

// Hamcrest Matchers (Junit 5 supports basic assertThat(with is) from Mockito core matchers):
//        assertThat(scores, hasItems(100, 101));
//        assertThat(scores, everyItem(greaterThan(90)));
//        assertThat(scores, everyItem(lessThan(200)));
//
//        // String
//        assertThat("", isEmptyString());
//        assertThat(null, isEmptyOrNullString());)
// Methods are available for every Collections.

// First: https://github.com/in28minutes/MockitoTutorialForBeginners/blob/master/Step18.md
// FAST >> Independent >> Repeatable (across envs) >> Self Validating (yield success or failure) >> Timely

// Test Doubles (Design Patten for Unit Testing Frameworks)
// Dummy (Matchers) >> Stub (thenReturn) >> Mock (dynamic STUB) >> Fake (In memory databases) >> Spies (SPY - Partial or No mock)

// How to write the good unit tests: https://github.com/mockito/mockito/wiki/How-to-write-good-tests
// Mockito: Mockito doesn't allow the dynamic stubbing of private, final and static methods.