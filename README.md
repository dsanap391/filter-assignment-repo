# Spring Boot Filter and Controller Example

This Spring Boot application demonstrates the implementation of a filter to intercept incoming HTTP requests and a controller to handle a GET request on the path "/".

## Filter

The filter (`CustomAuthenticationFilter`) intercepts incoming HTTP requests and checks if the header "PinggyAuthHeader" is present. If the header is present and not empty, the value is stored in a ThreadLocal variable. If the header is missing or empty, the filter responds with HTTP status code 401 (Unauthorized).

## Controller

The controller (`PinggyController`) handles a GET request on the path "/". It retrieves the value of the header "PinggyAuthHeader" from the ThreadLocal storage and returns it as a response body. If the header value is empty, it returns an error response with HTTP status code 401 (Unauthorized) in JSON format.

## Usage

1. Build the Spring Boot application.
2. Run the application.
3. Send a GET request to "/" with the header "PinggyAuthHeader" containing a non-empty value to retrieve the value of the header.
4. Send a GET request to "/" without the "PinggyAuthHeader" or with an empty value to receive an unauthorized error response.

