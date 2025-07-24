/** This file defines an API we can use to interact with the Shopping Items we already have. */

package yippieazon.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import yippieazon.backend.models.ShoppingItem;
import yippieazon.backend.repositories.ShoppingItemRepository;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class ShoppingItemController {

  @Autowired
  ShoppingItemRepository shoppingItemRepository;

  @GetMapping("/shopping-items")
  public ResponseEntity<List<ShoppingItem>> getAllShoppingItems(@RequestParam(required = false) String name) {

    try {
      List<ShoppingItem> shoppingItemList = new ArrayList<ShoppingItem>();

      // We want to get all shopping items.
      if (name == null) {
        // For each shopping item, add it to our shoppingItemModelList.
        shoppingItemRepository.findAll()
            .forEach(shoppingItem -> shoppingItemList.add(shoppingItem));
      }

      // We want to get only shopping items that contain the 'name' parameter value.
      else {
        // Get shopping items that contain 'name' anywhere within their name parameter
        // and return them in a list.
        shoppingItemRepository.findByNameContaining(name)
            .forEach(shoppingItem -> shoppingItemList.add(shoppingItem));
      }

      return new ResponseEntity<>(shoppingItemList, HttpStatus.OK);
    }

    catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

}
