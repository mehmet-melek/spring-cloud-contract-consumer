package org.melek.springcloudcontractconsumer;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.BDDAssertions.assertThat;

//@WireMockTest(httpPort = 8081)
class OrderServiceTest {
/*

    private final OrderService orderService = new OrderService();
    private Order order;

    @Test
    void testCreateOrder_whenProductAndStockExist_shouldReturnOrderCreated() {
        stubFor(any(urlPathEqualTo("/productReservation"))
                .withHeader("Content-Type", containing("application/json"))
                .withQueryParam("product", equalTo("ABC"))
                .withQueryParam("quantity", equalTo("10"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("Products are reserved")));

        order = new Order("ABC", 10);
        String result = orderService.createOrder(order);
        assertThat(result).contains("Order created");
    }

    @Test
    void testCreateOrder_whenProductIsNotExist_shouldReturnProductNotFoundMessage() {
        stubFor(any(urlPathEqualTo("/productReservation"))
                .withHeader("Content-Type", containing("application/json"))
                .withQueryParam("product", equalTo("XXX"))
                .withQueryParam("quantity", equalTo("10"))
                .willReturn(aResponse()
                        .withStatus(404)
                        .withBody("Warehouse Message : Product not found!")));

        order = new Order("XXX", 10);
        String result = orderService.createOrder(order);
        assertThat(result)
                .contains("The order could not be created.")
                .contains("Product not found!");
    }

    @Test
    void testCreateOrder_whenProductIsExitButStockNotEnough_shouldReturnStockErrorMessage() {
        stubFor(any(urlPathEqualTo("/productReservation"))
                .withHeader("Content-Type", containing("application/json"))
                .withQueryParam("product", equalTo("ABC"))
                .withQueryParam("quantity", equalTo("5"))
                .willReturn(aResponse()
                        .withStatus(404)
                        .withBody("Warehouse Message : Not enough products were found!")));
        order = new Order("ABC", 5);
        String result = orderService.createOrder(order);
        assertThat(result)
                .contains("The order could not be created.")
                .contains("Not enough products were found!");
    }
*/

}
