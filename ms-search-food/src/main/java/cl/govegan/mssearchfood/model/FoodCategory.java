package cl.govegan.mssearchfood.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@Document(collection = "foodCategories_v2")
public class FoodCategory {

   @Id
   private String id;
   private String categoryName;
   private int categoryCode;
      
}
