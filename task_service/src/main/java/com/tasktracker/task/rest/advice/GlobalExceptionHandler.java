package com.tasktracker.task.rest.advice;

import com.tasktracker.task.rest.errors.NotFoundException;
import com.tasktracker.task.rest.model.NotFoundDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundDTO> handleNotFound(NotFoundException ex) {
        NotFoundDTO notFoundDTO = new NotFoundDTO();
        notFoundDTO.setMessage(ex.getMessage());
        notFoundDTO.setStatus(404);
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(notFoundDTO);
    }
}
