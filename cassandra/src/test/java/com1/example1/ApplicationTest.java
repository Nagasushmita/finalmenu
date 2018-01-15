package com1.example1;

        import com.example.Application;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.boot.SpringBootConfiguration;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootConfiguration
public class ApplicationTest {
    @Test
    public void test() {
        Application.main(new String[]{
                "--server.port = 8888",
        });
    }

}