# Snowflake Demo

This is a Spring Boot application that demonstrates the use of the Snowflake algorithm to generate unique, time-sortable IDs. The application provides a REST API endpoint to generate a unique 64-bit ID using the Hutool library's Snowflake implementation.

## Prerequisites

To run this project, ensure you have the following installed:

- **Java**: Version 17 or higher
- **Maven**: For dependency management and building the project
- **Git**: To clone the repository (optional)

## Project Structure

The project consists of the following key files:

- `SnowflakeDemoApplication.java`: The main Spring Boot application class that starts the application.
- `SnowflakeController.java`: A REST controller exposing an endpoint to generate Snowflake IDs.
- `SnowflakeIDService.java`: A service class that uses the Hutool library to generate Snowflake IDs.
- `pom.xml`: The Maven configuration file with dependencies and build settings.

## Setup Instructions

1. **Clone the Repository** (if applicable):
   ```bash
   git clone <repository-url>
   cd snowflake-demo
   ```

2. **Build the Project**:
   Run the following command to download dependencies and build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Start the Spring Boot application with:
   ```bash
   mvn spring-boot:run
   ```

   The application will start on `http://localhost:8080` by default.

## Usage

Once the application is running, you can generate a Snowflake ID by making a GET request to the following endpoint:

- **Endpoint**: `GET /api/v1/generateid`
- **Response**: A 64-bit unique ID (e.g., `1234567890123456789`)

Example using `curl`:
```bash
curl http://localhost:8080/api/v1/generateid
```

## Configuration

The Snowflake ID generation can be customized via application properties. You can configure the `worker-id` and `datacenter-id` in the `application.properties` file (create it in `src/main/resources` if it doesn't exist):

```properties
snowflake.worker-id=1
snowflake.datacenter-id=1
```

- `snowflake.worker-id`: The worker ID (default: 1). Must be between 0 and 31.
- `snowflake.datacenter-id`: The datacenter ID (default: 1). Must be between 0 and 31.

## Dependencies

The project uses the following key dependencies:

- **Spring Boot Starter Web**: For building the REST API.
- **Hutool Core**: For the Snowflake ID generation implementation.
- **Spring Boot Starter Test**: For unit testing (used in test scope).

See the `pom.xml` file for the full list of dependencies.

## Testing

To run the unit tests, use:
```bash
mvn test
```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.