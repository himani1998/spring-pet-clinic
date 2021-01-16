package himani.spring.pet.springpetclinic.config;

import himani.spring.pet.springpetclinic.exampleBeans.FakeDataSource;
import himani.spring.pet.springpetclinic.exampleBeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


//@PropertySource({"classpath:dataSource.properties", "classpath:jms.properties"})
//@PropertySources({
//        @PropertySource("classpath:dataSource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
@Configuration
public class PropertyConfig {
    @Value("${himani.username}")
    String user;

    @Value("${himani.password}")
    String password;

    @Value("${himani.dburl}")
    String url;

    @Value("${himani.jms.username}")
    String jmsuser;

    @Value("${himani.jms.password}")
    String jmspassword;

    @Value("${himani.jms.url}")
    String jmsurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
       return fakeDataSource;
    }
    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker= new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
    //}
}
