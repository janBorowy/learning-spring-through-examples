package pl.student.web_scopes;


import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    Logger logger = LoggerFactory.getLogger(myController.class);

    @Resource(name = "fooRequest")
    Foo fooRequest;
    @Resource(name = "fooSession")
    Foo fooSession;
    @Resource(name = "fooApplication")
    Foo fooApplication;

    @RequestMapping(value = "/foo")
    @ResponseBody
    public String getFoo(final Model model) {
        fooRequest.incrementVal();
        fooSession.incrementVal();
        fooApplication.incrementVal();
        var builder = new StringBuilder();
        builder.append("fooRequest = " + fooRequest.getMyVal());
        builder.append(", ");
        builder.append("fooSession = " + fooSession.getMyVal());
        builder.append(", ");
        builder.append("fooApplication = " + fooApplication.getMyVal());
        return builder.toString();
    }


}
