package com1.example1.repositorytest;

import com.example.Domain.Menu_card;
import com.example.Service.MenuService;
import com.example.controller.MenuController;
import com.example.repository.MenuRepositoryelastic;
import com.example.repository.MenuRespository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static springfox.documentation.builders.PathSelectors.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMenuService {
@InjectMocks
   private MenuService menuService;

@Mock
MenuRespository menuRespository;
@Mock
private MenuController menuController;
@Mock
MenuRepositoryelastic menuRepositoryelastic;

    MockMvc mockMvc;
   // MockMvc mockMvc1;

    @Before
    public void setup() throws Exception {
        initMocks(this);
        mockMvc = standaloneSetup(menuService).build();
    }

    @Test
    public void saveTest() {
        Menu_card menu = new Menu_card();

        when(menuRespository.save(Matchers.any(Menu_card.class))).thenReturn(menu);
        menuController.addItemToMenu(menu);
    }


    /*@Test
    public void getAllTest() {
        menuService.getAllItems();
    }*/

    @Test
    public void deleteTest() {
        int id = 1;
        menuService.delete(id);

    }
    @Test
    public void getFoodPrice() {
        int min=20;
        int max=40;
        menuService.findBetween(min,max);
    }
    @Test
    public void getOneTest() {
        int id = 1;
        menuService.findById(id);
    }

    @Test
    public void updateTest() {
       Menu_card menu_card=new Menu_card(21,"cocacola",20);
        menuService.update(menu_card);
    }


}
