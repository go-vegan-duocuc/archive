package cl.govegan.mssearchfood.repository;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.lang.NonNull;

import cl.govegan.mssearchfood.model.Food;

@RepositoryRestResource(collectionResourceRel = "foods_v2", path = "foods_v2")
public interface FoodRepository extends MongoRepository<Food, String> {

   @Query("{ 'name' : { $regex: ?0, $options: 'i' } }")
   Page<Food> findAllFoodsByNameContaining(@NonNull String name, Pageable pageable);

   @Query("{ 'category.$id': ?0 }")
   Page<Food> findByCategoryId(ObjectId  categoryId, Pageable pageable);

}
