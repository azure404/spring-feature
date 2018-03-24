package spec.spring.aop

import com.azure.spring.SpringConfig
import com.azure.spring.common.model.Clothes
import com.azure.spring.common.model.Person
import com.azure.spring.common.model.Result
import com.azure.spring.common.service.PersonService
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import spock.lang.Specification

class ValidateSpec extends Specification{

    def "Validate Aspect Spec"(){
        given:"spring context init"
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)
        PersonService service = context.getBean(PersonService.class)
        Person person = p

        when:"call service method"
        Result res = service.validate(person)

        then:"check result"
        println(res.getMessage())

        where:
        p << [
                new Person("Alice", 1, new Clothes()),
                new Person(null, 1, new Clothes("green")),
                new Person("Alice", 3, new Clothes("green"))
        ]

    }

}
