//package win.yellowpal.mall.exception;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.validation.BindException;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import win.yellowpal.mall.result.CodeMsg;
//import win.yellowpal.mall.result.Result;
//
//@ControllerAdvice
//@ResponseBody
//public class GlobalExceptionHandler {
//	
//	@ExceptionHandler(BindException.class)
//	public Result<String> exceptionHandler(HttpServletRequest request, Exception e){
//		if(e instanceof BindException){
//			
//			BindException bindException = (BindException) e;
//			List<ObjectError> errors = bindException.getAllErrors();
//			
//			ObjectError error = errors.get(0);
//			String msg = error.getDefaultMessage();
//			
//			return Result.error(CodeMsg.BIND_ERROR.fillArgs(msg));
//		}
//		
//		e.printStackTrace();
//		
//		return Result.error(CodeMsg.SERVER_ERROR);
//	}
//}
