/** Defines the way our data looks. */

package yippieazon.backend.models;

import jakarta.persistence.*;

@Entity // Denotes that this is a persistent Java class.
@Table(name = "shoppingitems") // Creates an associated table.
public class ShoppingItemModel {

  @Id // Denotes the primary ID
  @GeneratedValue(strategy = GenerationType.AUTO) // The method used to generate the primary ID.
  private long id;

  @Column(name = "name") // The way to generate columns for the table.
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private float price;

}
