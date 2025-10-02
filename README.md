# MoviesSpringboot

A Spring Boot-based web application for managing and exploring movie data. This project demonstrates a modern Java backend with RESTful APIs, database integration, and clean architecture principles.

## Features

- RESTful API for CRUD operations on movies
- Integration with relational databases (e.g., MySQL, H2)
- Pagination and sorting support for movie lists
- Error handling and input validation
- Modular code structure for maintainability
- Easy extensibility for additional features

## Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **Database:** H2 (in-memory) or MySQL (production)
- **Maven** (build tool)

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Optional: Docker (for containerization)

### Setup

1. **Clone the repository**

   ```bash
   git clone https://github.com/MadushanR/MoviesSpringboot.git
   cd MoviesSpringboot
   ```

2. **Build the project**

   ```bash
   mvn clean install
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

   By default, the application uses an in-memory H2 database.

4. **Access the API**

   Open [http://localhost:8080](http://localhost:8080) in your browser or use tools like Postman to interact with the endpoints.

### API Endpoints (Sample)

- `GET /api/movies` - List all movies
- `GET /api/movies/{id}` - Get movie by ID
- `POST /api/movies` - Add a new movie
- `PUT /api/movies/{id}` - Update a movie
- `DELETE /api/movies/{id}` - Delete a movie

See the Swagger/OpenAPI documentation at `/swagger-ui.html` (if enabled).

## Configuration

- Change database settings in `src/main/resources/application.properties`
- For production, configure MySQL or another supported DB

## Contributing

Pull requests are welcome! Please open issues for suggestions or bugs.

1. Fork this repo
2. Create your feature branch (`git checkout -b feature/foo`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/foo`)
5. Open a Pull Request

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact

Maintainer: [MadushanR](https://github.com/MadushanR)
