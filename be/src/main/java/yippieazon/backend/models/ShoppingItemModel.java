package yippieazon.backend.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "yippieazon_shopping_items")
@Entity
public class ShoppingItemModel {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String itemName;

  private int itemPrice;

  private String itemDescription;

  public ShoppingItemModel(String itemName, int itemPrice, String itemDescription) {
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemDescription = itemDescription;
  }

  public String getItemName() {
    return this.itemName;
  }

  public int getItemPrice() {
    return this.itemPrice;
  }

  public String getItemDescription() {
    return this.itemDescription;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

}
