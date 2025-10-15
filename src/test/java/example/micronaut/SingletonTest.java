package example.micronaut;

import example.micronaut.core_basics.bean_scopes.Robot;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.BlockingHttpClient;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@MicronautTest
public class SingletonTest {

    @Inject
    Robot robot;

    @Inject
    Robot robot2;

    @Test
    void onlyOneInstanceOfTheBeanExistsForSingletonBeans() {
        String serialID = robot.getSerialNumber();
        String serialID2 = robot2.getSerialNumber();
        assertNotEquals(serialID, serialID2);
    }


}
