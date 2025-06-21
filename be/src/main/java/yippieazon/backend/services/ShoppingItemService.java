package yippieazon.backend.services;

import org.springframework.stereotype.Service;

import yippieazon.backend.models.ShoppingItemModel;
import yippieazon.backend.repositories.ShoppingItemRepository;

import java.util.List;

@Service
public class ShoppingItemService {

  private ShoppingItemRepository shoppingItemRepository;

  public ShoppingItemService(ShoppingItemRepository shoppingItemRepository) {
    this.shoppingItemRepository = shoppingItemRepository;
  }

  public List<ShoppingItemModel> allShoppingItems() {
    return shoppingItemRepository.findAll();
  }

  public ShoppingItemModel createShoppingItem(String itemName, int itemPrice, String itemDescription) {
    ShoppingItemModel shoppingItemModel = new ShoppingItemModel(itemName, itemPrice, itemDescription);
    return shoppingItemRepository.save(shoppingItemModel);
  }

}
