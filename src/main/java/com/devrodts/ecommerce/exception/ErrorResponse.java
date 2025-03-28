package com.devrodts.ecommerce.exception;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime timestamp, String message, String path, int status, String error) {
}
