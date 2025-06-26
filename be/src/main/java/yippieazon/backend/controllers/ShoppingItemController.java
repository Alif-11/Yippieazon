package yippieazon.backend.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yippieazon.backend.dto.ShoppingItemDto;
import yippieazon.backend.models.ShoppingItemModel;
import yippieazon.backend.services.ShoppingItemService;

@RestController
public class ShoppingItemController {
  private ShoppingItemService shoppingItemService;

  public ShoppingItemController(ShoppingItemService shoppingItemService) {
    this.shoppingItemService = shoppingItemService;
  }

  @GetMapping("/all-items")
  public ResponseEntity<List<ShoppingItemModel>> getAllShoppingItems() {
    List<ShoppingItemModel> listOfShoppingItems = this.shoppingItemService.allShoppingItems();
    return ResponseEntity.ok().body(listOfShoppingItems);
  }
}
