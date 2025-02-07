# Multithreaded Web Server with Thread Pool

## Overview
This project is a custom-built multithreaded web server implemented in Java, utilizing a thread pool to efficiently handle multiple client requests concurrently. The server can manage multiple simultaneous connections without creating a new thread for each client, enhancing performance and scalability.

## Features
- **Thread Pool Implementation:** Efficient resource management using Java's `ExecutorService` to handle concurrent client requests.
- **Concurrent Client Handling:** Supports multiple simultaneous connections, ensuring fast and reliable responses.
- **Graceful Shutdown:** Ensures all threads are properly terminated when the server stops.
- **Simple Client-Server Communication:** Demonstrates basic request-response communication using sockets.

## Technologies Used
- **Java**
- **ExecutorService (Thread Pool)**
- **Socket Programming**

## How It Works
1. The server initializes on a specified port and sets up a thread pool.
2. For every client connection, a task is submitted to the thread pool.
3. The server responds to the client, and the connection is closed gracefully.
4. The client can send multiple concurrent requests to the server.

## Setup Instructions

### Prerequisites
- Java JDK installed
- Git (for cloning the repository)

### Running the Server
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Multithreaded-Web-Server.git
   cd Multithreaded-Web-Server
   ```
2. Compile the server:
   ```bash
   javac Server.java
   ```
3. Run the server:
   ```bash
   java Server
   ```

### Running the Client
1. Compile the client:
   ```bash
   javac Client.java
   ```
2. Run the client:
   ```bash
   java Client
   ```

## Testing with JMeter
1. Install [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi).
2. Create a new test plan:
   - Add a **Thread Group** to simulate multiple users.
   - Add a **TCP Sampler**:
     - Set **Server Name or IP** to `localhost`.
     - Set **Port Number** to the server's port (e.g., `8010`).
   - Add a **View Results Tree** listener to monitor responses.
3. Run the test plan and observe how the server handles concurrent requests.

## License
This project is licensed under the MIT License.

---

