package example.micronaut.message;

import io.micronaut.context.LocalizedMessageSource;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.Optional;

@Controller("/hello-world")
public class HelloWorldController {

    private final LocalizedMessageSource messageSource;

    public HelloWorldController(LocalizedMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Produces(MediaType.TEXT_PLAIN)
    @Get("/say-hello")
    String index() {
//        return messageSource.getMessage("hello.world");
        return messageSource.getMessage("hello.world").orElse("Hello Empty");
    }
}
