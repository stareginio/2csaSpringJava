@RestController
public class IndexController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}

// reference
// https://stackoverflow.com/questions/25356781/spring-boot-remove-whitelabel-error-page