package example.micronaut.core_basics.bean_scopes;

import io.micronaut.context.annotation.Prototype;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.util.UUID;

//@Singleton
@Prototype
public class Robot {

    @NonNull
    private final String serialNumber;

    public Robot() {
        this.serialNumber = UUID.randomUUID().toString();
    }

    @NonNull
    public String getSerialNumber() {
        return this.serialNumber;
    }
}
