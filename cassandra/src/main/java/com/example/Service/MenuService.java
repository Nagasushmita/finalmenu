package com.example.Service;

import com.example.Domain.Menu_card;
import com.example.Domain.Menucardelasticsearch;
import com.example.repository.MenuRepositoryelastic;
import com.example.repository.MenuRespository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MenuService {


    @Autowired
    private MenuRespository menuRespository;
    @Autowired
    private MenuRepositoryelastic menuRepositoryelastic;


  /*  public List<Menucardelasticsearch> getAllItems() {
        List<Menucardelasticsearch> arrayList = new ArrayList<>();
        menuRepositoryelastic.findAll().forEach(arrayList::add);
        return arrayList;
    }*/

    public Menucardelasticsearch findById(int id) {

        return menuRepositoryelastic.findOne(id);
    }


/*

    public void addItemToMenu(Menu_card menu_card) {
        menuRespository.save(menu_card);
        Menucardelasticsearch menucardelasticsearch=modelMapper.map(menu_card,Menucardelasticsearch.class);
        menuRepositoryelastic.save(menucardelasticsearch);
    }

*/

    public void delete(Integer id) {
        menuRespository.delete(id);
        menuRepositoryelastic.delete(id);
    }
    public void update(Menu_card menu_card){
        menuRespository.save(menu_card);
        ModelMapper modelMapper=new ModelMapper();
        Menucardelasticsearch menucardelasticsearch=modelMapper.map(menu_card,Menucardelasticsearch.class);
        menuRepositoryelastic.save(menucardelasticsearch);

    }

    public List<Menucardelasticsearch> findBetween(int min, int max) {
        List<Menucardelasticsearch> arrayList = new ArrayList<>();
        //arrayList.addAll(menuRepositoryelastic.findMenucardelasticsearchByPrice(min,max));
        menuRepositoryelastic.findByPriceBetween(min, max).forEach(arrayList::add);
        return arrayList;

    }
}