package example.micronaut.core_basics.name;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Named;

@Controller("/name-annotation")
public class NameController {

    private final Hello hello;

    public NameController(@Nullable @Named("hello-vietnam") Hello hello) {
        this.hello = hello;
    }

    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN) // <3>
    public String hello() {
        return this.hello.getText();
    }
    
}
