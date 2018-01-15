package com1.example1.domaintest;


import com.example.Domain.Menu_card;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class testMenu_card {
    ObjectMapper objectMapper = new ObjectMapper();
    @InjectMocks
    Menu_card menu_card;

    @Test
    public void tectCategory() throws Exception{
        String expectedValue="{\"id\":1,\"name\":\"pepsi\",\"price\":120}";
        Menu_card menu_cardTest=new Menu_card(12,"sdd",1);
        menu_cardTest.setId(1);
        menu_cardTest.setName("pepsi");
        menu_cardTest.setPrice(120);
String testString=objectMapper.writeValueAsString(menu_cardTest);
assertEquals(expectedValue,testString);
    }


}
