package com.annabon.controller;


import com.annabon.entity.Item;
import com.annabon.entity.request.AddItemRequest;
import com.annabon.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    private ItemRepository itemRepository;


    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Item> findAllItems(){
        return itemRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addItem(@RequestBody AddItemRequest addItemRequest){
        itemRepository.save(new Item().withDepartmentId(addItemRequest.getDepartmentId())
                                      .withName(addItemRequest.getName()));
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Item getItem(@PathVariable long id){
        return itemRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteItem(@PathVariable long id){
        itemRepository.delete(id);
    }
}
