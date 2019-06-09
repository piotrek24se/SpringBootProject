package pl.piotrnowicki.springbootfirstproject.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private String stackTrace;
    private String details;

//    public ExceptionResponse(Date timestamp, String message, String stackTrace, String details) {
//        this.timestamp = timestamp;
//        this.message = message;
//        this.stackTrace = stackTrace;
//        this.details = details;
//    }
}
