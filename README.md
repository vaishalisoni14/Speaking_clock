# Speaking Clock

This is a Java-based Speaking Clock application that converts 24-hour time into its word representation. The application is built using the Spring Boot framework and includes Swagger for API documentation. The project also handles special cases like midday and midnight and includes comprehensive unit tests.

## Features

- Converts 24-hour format time (e.g., "14:30") into words (e.g., "It's fourteen thirty").
- Handles special cases like "12:00" as "It's Midday" and "00:00" as "It's Midnight".
- Validates the input time format and throws a custom `InvalidTimeFormatException` for invalid inputs.
- Provides a REST API for converting the current time or a provided time into words.
- Swagger integration for API documentation.

## Technologies Used

- Java 17
- Spring Boot 3.x
- Swagger 2.0
- Maven for build and dependency management
- JUnit 5 for testing

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven 3.8.1 or higher

### Clone the Repository

```bash
git https://github.com/vaishalisoni14/Speaking_clock.git
cd Speaking_clock
