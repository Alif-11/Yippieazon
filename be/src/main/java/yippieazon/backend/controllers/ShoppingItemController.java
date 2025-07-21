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

import yippieazon.backend.models.ShoppingItemModel;
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
  public ResponseEntity<List<ShoppingItemModel>> getAllShoppingItems(@RequestParam(required = false) String name) {
    List<ShoppingItemModel> shoppingItemModelList = new ArrayList<ShoppingItemModel>();

    return new ResponseEntity<>(shoppingItemModelList, HttpStatus.OK);
  }

}
