package netgloo.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The Class MainController.
 */
@Controller
public class MainController {

  /**
   * Index.
   *
   * @return the string
   */
  @RequestMapping("/")
  // @ResponseBody
  public String index() {
    return "hello.html";
  }

}
