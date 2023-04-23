package org.example.testing.mockito.order.bo;

import org.example.testing.mockito.order.bo.exception.BOException;
import org.example.testing.mockito.order.dao.OrderDAO;
import org.example.testing.mockito.order.dto.Order;

public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;

    void setDao(OrderDAO dao);
}
