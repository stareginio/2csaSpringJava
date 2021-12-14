@CrossOrigin
@RestController
public class IndexController implements ErrorController {
    
    private static final String PATH = "/error";
    
    @RequestMapping(value = PATH)
    public ModelAndView saveLeadQuery() {           
        return new ModelAndView("forward:/");
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}

// reference:
// https://stackoverflow.com/questions/69153280/spring-boot-refresh-issue-when-using-reactjs-and-spring-boot-together