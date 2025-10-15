package example.micronaut.validation;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Error;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Controller("/books")
public class BookController {

    @View("bookscreate")
    @Get("/create")
    public Map<String, Object> create() {
        return createModelWithBlankValues();
    }

    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Post("/save")
    public HttpResponse save(@Valid @Body CommandBookSave cmd) {
        return HttpResponse.ok();
    }

    private Map<String, Object> createModelWithBlankValues() {
        final Map<String, Object> model = new HashMap<>();
        model.put("title", "");
        model.put("pages", "");
        return model;
    }
}
