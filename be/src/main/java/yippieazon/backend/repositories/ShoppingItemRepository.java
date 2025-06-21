// This file helps work with the Shopping Items database.

package yippieazon.backend.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yippieazon.backend.models.ShoppingItemModel;

@Repository
public interface ShoppingItemRepository extends JpaRepository<ShoppingItemModel, UUID> {

}
