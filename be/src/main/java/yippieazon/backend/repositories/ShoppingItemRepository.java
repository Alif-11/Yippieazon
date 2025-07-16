/** Class that contains a lot of useful database functions already implemented, 
 * such as save, findOne, findById, findAll, count, delete, deleteById, etc. */

package yippieazon.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import yippieazon.backend.models.ShoppingItemModel;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItemModel, Long> {

}
