**Temperature Sensor Client**

This client application is designed to consume temperature sensor data from a RESTful API provided by the Temperature Sensor Microservice. It allows users to retrieve sensor measurements and register new sensors.

### Features:

- **Retrieve Measurements**: Users can fetch all temperature sensor measurements stored in the database.
- **Retrieve Rainy Days Measurements**: Users can retrieve temperature sensor measurements taken on rainy days.
- **Register Sensor**: Users can register a new temperature sensor by providing sensor details.

### Usage:

1. **Retrieve Measurements**:
   - Endpoint: `/measurements`
   - HTTP Method: GET
   - Returns: List of all temperature sensor measurements.
   
2. **Retrieve Rainy Days Measurements**:
   - Endpoint: `/measurements/rainyDays`
   - HTTP Method: GET
   - Returns: List of temperature sensor measurements taken on rainy days.
   
3. **Register Sensor**:
   - Endpoint: `/sensors/registration`
   - HTTP Method: POST
   - Parameters: JSON representation of sensor details (e.g., id, location).
   - Returns: Success message upon successful registration.

### How to Use:

1. **Retrieve Measurements**:
   - Send a GET request to `/measurements` endpoint.
   - Receive a JSON response containing the list of sensor measurements.

2. **Retrieve Rainy Days Measurements**:
   - Send a GET request to `/measurements/rainyDays` endpoint.
   - Receive a JSON response containing the list of sensor measurements taken on rainy days.

3. **Register Sensor**:
   - Send a POST request to `/sensors/registration` endpoint with JSON payload containing sensor details.
   - Receive a success message upon successful registration.

### Dependencies:

- HTTP Client library (e.g., Apache HttpClient, OkHttp)
- JSON parsing library (e.g., Gson, Jackson)
  
### License:

This project is licensed under the [license name]. See the LICENSE file for details.

### Support:

For any inquiries or issues, please contact [contact email]. Bug reports and feature requests are welcome.
