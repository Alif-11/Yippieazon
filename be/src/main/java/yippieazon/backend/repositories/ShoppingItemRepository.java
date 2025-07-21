/** Class that contains a lot of useful database functions already implemented, 
 * such as save, findOne, findById, findAll, count, delete, deleteById, etc. 
 * 
 * This class allows for interaction with Shopping Items. */

package yippieazon.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import yippieazon.backend.models.ShoppingItemModel;

import java.util.List;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItemModel, Long> {

  List<ShoppingItemModel> findByName(String name);

}
