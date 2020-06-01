import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(StudentConfig2.class)
public class StudentConfig {

    @Autowired
    StudentDao dao;

    @Bean
    public StudentSearchService studentSearchService() {
        return new StudentSearchService(dao);
    }

    @Bean
    public StudentRegisterService studentRegisterService() {
        return new StudentRegisterService(dao);
    }
}


