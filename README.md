# DockerReactAndSpringbootNginxApp

This repository contains the code and instructions for setting up a learning project based on the Codeching YouTube videos. The project combines Docker, React, Spring Boot, and Nginx to create a full-stack web application.

## Prerequisites

Before getting started, make sure you have the following installed:

- Docker
- Node.js
- Java Development Kit (JDK)
- Maven

## Setup Instructions

Follow the steps below to set up the project:

1. Clone the repository:

   ```bash
   git clone <repository_url>
   ```

2. Change into the project directory:

   ```bash
   cd DockerReactAndSpringbootNginxApp
   ```

3. Build the React frontend:

   ```bash
   cd springbootreact
   npm install
   npm run build
   ```

4. Build the Spring Boot backend:

   ```bash
   cd ../springtest
   mvn clean install
   ```

5. Build the Docker images and start the containers:

   ```bash
   cd ../nginx
   docker-compose up --build
   ```

   This command will build and run the Docker containers for the frontend, backend, and Nginx.

6. Once the containers are up and running, you can access the application in your web browser at `http://localhost`.

## Resources

- Codeching YouTube Videos:
  - [Video 1](https://youtu.be/rsr6X5M6-6M)
  - [Video 2](https://youtu.be/IGg1Rx29_O0)
  - [Video 3](https://youtu.be/N1MT1Ny6JC8)

## License

This project is licensed under the [MIT License](LICENSE).
```
