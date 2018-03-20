package at.refugeescode.theamazinghellosyria.hellosyria;

import org.springframework.stereotype.Component;

@Component
public class HelloSyria {
    private Hello hello;
    private Syria syria;

    public HelloSyria(Hello hello, Syria syria) {
        this.hello = hello;
        this.syria = syria;
    }

    public String sayHelloSyria(){
        String hello = this.hello.sayHello();
        String syria = this.syria.saySyria();
        return hello+" "+syria;
    }
}
