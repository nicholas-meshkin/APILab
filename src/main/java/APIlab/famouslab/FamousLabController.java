package APIlab.famouslab;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import APIlab.famouslab.ApiService;
import APIlab.famouslab.model.Complete;
import APIlab.famouslab.model.Tiny;


@Controller
public class FamousLabController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Tiny> tinyList = apiService.tinyList();
		tinyList.sort(Comparator.comparing(Tiny::getYear));
		return new ModelAndView("index", "list", tinyList);
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<Complete> completeList = apiService.completeList();
		completeList.sort(Comparator.comparing(Complete::getYear));
		return new ModelAndView("complete", "list", completeList);
	}

}
