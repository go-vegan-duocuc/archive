package cl.govegan.mssearchfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.govegan.mssearchfood.model.FoodCategory;

@RepositoryRestResource(collectionResourceRel = "foodCategories", path = "foodCategories")
public interface FoodCategoryRepository extends MongoRepository<FoodCategory, String>{
   
}
