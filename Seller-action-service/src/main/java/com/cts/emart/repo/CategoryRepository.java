package com.cts.emart.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.CategoryEntity;
import com.cts.emart.model.Category;
@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity , Integer> {

	Optional<Category> findByCategoryName(String categoryName);

}
