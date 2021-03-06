package com.cts.emart.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {
	Optional<Login> findById(Integer userId);
}
