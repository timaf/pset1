package at.refugeescode.theamazinghellosyria.hellosyria;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class HelloSyriaTest {
    @Autowired
    private  HelloSyria helloSyria;

    @Test
    void sayHelloSyria() {
        String massage = helloSyria.sayHelloSyria();
        assertThat(massage,is("Hello Syria"));


    }
}