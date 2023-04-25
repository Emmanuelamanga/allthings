import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;


public class ErrorDetails {
    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;
    
    public ErrorDetails(HttpStatus status, String message) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }
    
    // Getters and setters
}
