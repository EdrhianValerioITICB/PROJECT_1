package cat.iticbcn.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CompanyAndOfferNotconnected {

	@ResponseBody

	@ExceptionHandler(CompanyAndOfferNotConnectedException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)

	public String companyAndofferNotConnected(CompanyAndOfferNotConnectedException ex) {
		return ex.getMessage();
	}
}
