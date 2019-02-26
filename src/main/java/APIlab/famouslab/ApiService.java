package APIlab.famouslab;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import APIlab.famouslab.model.Complete;
import APIlab.famouslab.model.ScientistResponse;
import APIlab.famouslab.model.Tiny;

@Component
public class ApiService {
	
//private RestTemplate restTemplateWithUserAgent;
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
//	{
//	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
//		// request. Some of the APIs in this demo have a bug where User-Agent is required.
//		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
//	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
//	        return execution.execute(request, body);
//	    };
//	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
//	}
	private RestTemplate restTemplate = new RestTemplate();
	public List<Tiny> tinyList(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ScientistResponse response = restTemplate.getForObject(url, ScientistResponse.class);
		return response.getTinyList();
		
	}
	
	public List<Complete> completeList(){
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		ScientistResponse response = restTemplate.getForObject(url, ScientistResponse.class);
		return response.getCompleteList();
		
	}

}
