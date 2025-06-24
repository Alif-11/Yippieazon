package yippieazon.backend.dto;

// Records create immutable data.
// Later on, we can change from record to class to edit our shopping items.
public record ShoppingItemDto(String itemName, int itemPrice, String itemDescription) {

}
