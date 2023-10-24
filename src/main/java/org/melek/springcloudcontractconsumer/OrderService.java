package org.melek.springcloudcontractconsumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class OrderService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String WAREHOUSE_URL = "http://localhost:8081/productReservation";

    public String createOrder(Order order) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(WAREHOUSE_URL)
                .queryParam("product", order.getProduct())
                .queryParam("quantity", order.getQuantity());

        ResponseEntity<String> warehouseResponse;

        try {
            warehouseResponse = this.restTemplate.exchange(
                    builder.toUriString(),
                    HttpMethod.GET,
                    new HttpEntity<>(httpHeaders),
                    String.class);
        } catch (RuntimeException exception) {
            return "The order could not be created.\n" + exception.getMessage();
        }

        return warehouseResponse.getStatusCode().is2xxSuccessful() ?
                "Order created\n" + order.toString() :
                "Unknown exception : " + warehouseResponse.getBody();
    }
}

@Getter
@AllArgsConstructor
@ToString
class Order {
    private String product;
    private int quantity;
}
