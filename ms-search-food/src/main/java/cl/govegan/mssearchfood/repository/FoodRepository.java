package cl.govegan.mssearchfood.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.lang.NonNull;

import cl.govegan.mssearchfood.model.Food;

public interface FoodRepository extends MongoRepository<Food, String> {

   @Override
   @NonNull
   Page<Food> findAll(@NonNull Pageable pageable);

   @Query("{ 'name' : { $regex: ?0, $options: 'i' } }")
   Page<Food> findByNameContaining(@NonNull String keywords, Pageable pageable);

   @NonNull
   @Override
   Optional<Food> findById(@NonNull String id);
   
}
