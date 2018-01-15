package com1.example1.domaintest;


import com.example.Domain.Menucardelasticsearch;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class testMenucardelasticsearch {
    ObjectMapper objectMapper=new ObjectMapper();

    @InjectMocks
    Menucardelasticsearch menucardelasticsearch;

    @Test
    public void testCase() throws Exception{
        String expectedValue="{\"id\":1,\"name\":\"pepsi\",\"price\":120}";
        Menucardelasticsearch menucardelasticsearchTest=new Menucardelasticsearch(12,"jlkj",1);
        menucardelasticsearchTest.setId(1);
        menucardelasticsearchTest.setName("pepsi");
        menucardelasticsearchTest.setPrice(120);
        String testString=objectMapper.writeValueAsString(menucardelasticsearchTest);
        assertEquals(expectedValue,testString);

    }






}
