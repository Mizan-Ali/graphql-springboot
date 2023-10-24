# GraphQL with Spring Boot

This repository demonstrates the implementation of GraphQL in a Spring Boot application, providing a clear comparison with traditional REST APIs. Two controllers, `MenuControllerRest.java` and `MenuControllerGraphQl.java`, are implemented to showcase the differences between these approaches.

## Getting Started

1. **Clone the Repository**

   ```sh
   git clone https://github.com/Mizan-Ali/graphql-springboot.git
   ```

2. **Navigate to the Project Directory**

   ```sh
   cd graphql-springboot
   ```

3. **Install Dependencies**

   ```sh
   mvn install
   ```

## Usage

### REST API

To interact with the REST API, use `MenuControllerRest.java`. The API endpoints can be accessed through Postman. Import the provided [Postman Collection](https://api.postman.com/collections/28164184-54ce4d57-ffa5-4e4f-85d5-4ea0ec33bc86?access_key=PMAT-01HDH4XBAZ7AWMTCPPJHMGSCTW) to get started.

### GraphQL API

The GraphQL API is implemented in `MenuControllerGraphQl.java`. Access the GraphQL endpoint at:

```
http://localhost:8080/graphql
```

#### Example GraphQL Query

```graphql
query {
    getAllMenus {
        id
        dishName
        description
        price
    }
}
```

## Postman Collection

For easy testing, use the [Postman Collection](https://api.postman.com/collections/28164184-54ce4d57-ffa5-4e4f-85d5-4ea0ec33bc86?access_key=PMAT-01HDH4XBAZ7AWMTCPPJHMGSCTW) provided in the repository.

## Contributing

Contributions are welcome! Fork the repository, make your changes, and submit a pull request.

## Contact Information

For any queries, please contact [Mizan](mailto:mdmizanali04@gmail.com).
