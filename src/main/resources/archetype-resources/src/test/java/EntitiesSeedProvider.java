#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.flexicore.model.Baseclass;
import com.flexicore.test.EntityProviderClasses;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class EntitiesSeedProvider {

    @Primary
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public EntityProviderClasses getSeeds() {
        return new EntityProviderClasses(new HashSet<>(Arrays.asList(Baseclass.class)));

    }
}
