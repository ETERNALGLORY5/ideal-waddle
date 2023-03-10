package huffle.puff.wand.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import huffle.puff.wand.dtos.ApiResponseMessage;

@RestController
public class GlobalExceptionHandler {
   
  private  Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
   //handel resource not found exception

   @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ApiResponseMessage> 
         resourceNotFoundExceptionHandler(ResourceNotFoundException ex)   
   {

    logger.info("Exception Handler Invoked !!");
     ApiResponseMessage response = ApiResponseMessage
                        .builder()
                        .message(ex.getMessage())
                        .status(HttpStatus.NOT_FOUND)
                        .success(true)
                        .build();
      return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
   }


}
