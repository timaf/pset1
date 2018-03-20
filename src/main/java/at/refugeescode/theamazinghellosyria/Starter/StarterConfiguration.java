package at.refugeescode.theamazinghellosyria.Starter;

import at.refugeescode.theamazinghellosyria.hellosyria.Hello;
import at.refugeescode.theamazinghellosyria.hellosyria.HelloSyria;
import at.refugeescode.theamazinghellosyria.hellosyria.Syria;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.xml.soap.SOAPPart;

@Configuration
public class StarterConfiguration {

    @Bean
    public ApplicationRunner mySayHelloSyria(HelloSyria helloSyria){
        return  args -> {
            String result = helloSyria.sayHelloSyria();
            System.out.println(result);
        };

    }
}
