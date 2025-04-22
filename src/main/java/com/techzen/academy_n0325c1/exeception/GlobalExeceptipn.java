package com.techzen.academy_n0325c1.exeception;

import com.techzen.academy_n0325c1.Controller.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class GlobalExeceptipn {
    @ExceptionHandler(AppExeception.class)
    public ResponseEntity<?> handlAppException(AppExeception e){
              ErrorCode errorCode = e.getErrorCode();

              return ResponseEntity.status(errorCode.getStatus()).body(
                      ApiResponse.builder()
                      .code(errorCode.getCode())
                      .massage(errorCode.getMessage())
                      .build()
              );
    }
}
