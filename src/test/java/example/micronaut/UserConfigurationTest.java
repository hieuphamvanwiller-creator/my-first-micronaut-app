package example.micronaut;

import example.micronaut.core_basics.configuration.UserConfiguration;
import io.micronaut.context.ApplicationContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserConfigurationTest {

    @Test
    void testTeamConfiguration() {
//        Map<String, Object> items = new HashMap<>();
//        items.put("user.username", "user001");
//        items.put("user.email", "user001@gmail.com");
//        items.put("user.full-name", "USER 001");

        ApplicationContext ctx = ApplicationContext.run();
        UserConfiguration userConfiguration = ctx.getBean(UserConfiguration.class);

        assertEquals("user001", userConfiguration.getUsername());
        assertEquals("USER 001", userConfiguration.getFullName());
        assertEquals("user001@gmail.com", userConfiguration.getEmail());

        ctx.close();
    }
}
