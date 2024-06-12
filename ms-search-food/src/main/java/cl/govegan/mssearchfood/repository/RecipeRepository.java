package cl.govegan.mssearchfood.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.lang.NonNull;

import cl.govegan.mssearchfood.model.recipe.Recipe;

public interface RecipeRepository extends MongoRepository<Recipe, String>{

   @Override
   @NonNull
   Page<Recipe> findAll(@NonNull Pageable pageable);

   @Query("{ 'title' : { $regex: ?0, $options: 'i' } }")
   Page<Recipe> findByTitleContaining(@NonNull String keywords, Pageable pageable);

   @Override
   @NonNull
   Optional<Recipe> findById(@NonNull String id);

}