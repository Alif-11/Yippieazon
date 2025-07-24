/** Class that contains a lot of useful database functions already implemented, 
 * such as save, findOne, findById, findAll, count, delete, deleteById, etc. 
 * 
 * This class allows for interaction with Shopping Items. */

package yippieazon.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import yippieazon.backend.models.ShoppingItem;

import java.util.List;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItem, Long> {

  // Spring Data JPA will automatically write implementations for this assuming
  // we follow method conventions.

  // If we had findByName, this method would only return shopping items whose name
  // matched exactly.

  // By adding the word containing to the end of the method, this method will now
  // match for shopping items that contain the 'name' parameter value we passed
  // anywhere within the shopping item's name, and return said items in a List.
  List<ShoppingItem> findByNameContaining(String name);

}
