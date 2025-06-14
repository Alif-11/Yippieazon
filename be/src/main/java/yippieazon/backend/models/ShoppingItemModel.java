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
  private UUID d;

}
