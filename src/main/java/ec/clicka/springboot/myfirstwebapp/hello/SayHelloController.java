package ec.clicka.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    //"say-hello"  => "Hello! What are you learning today?"

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return """ 
            <html>
                <head>
                    <title>My first HTML Page - Changed</title>
                </head>
                <body>
                    <h1>My first html page with body - Changed</h1>
                    <h2>Subtitle</h2>
                </body>
            </html>
            """;
    }
}
