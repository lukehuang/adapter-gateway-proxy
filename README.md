# Adapter + Gateway + Proxy

### Requirements

- Java 11
- Maven

### Run

- Terminal: `mvn spring-boot:run`
- IntelliJ: Just start the application

### Execution

Endpoint:

`POST http://localhost:8080/payments`

Payload
```json
{
    "proxy": "CLIP",
    "order": {
        "id": 7891,
        "items": [
            {
                "id": 1287,
                "quantity": 5,
                "price": 12.5
            },
            {
                "id": 1281,
                "quantity": 2,
                "price": 15
            }
        ]
    }
}
```