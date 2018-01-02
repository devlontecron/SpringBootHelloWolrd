package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

	 @RequestMapping(method = RequestMethod.GET)
	    public String getXml() {
	        return "1 <html><body>Hello World Service</body></html>";
	    }
}
