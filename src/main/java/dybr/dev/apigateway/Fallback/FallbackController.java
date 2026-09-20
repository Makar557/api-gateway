package dybr.dev.apigateway.Fallback;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dybr.dev.apigateway.DTO.ErrorResponse;

@RestController
@RequestMapping("/api/fallback/users")
public class FallbackController {

    @GetMapping
    public ResponseEntity<ErrorResponse> fallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(new ErrorResponse("User service is currently unavailable"));
    }
}
