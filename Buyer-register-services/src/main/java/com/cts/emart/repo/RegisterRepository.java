package com.cts.emart.repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.emart.entity.Register;

@Repository
public interface RegisterRepository extends CrudRepository<Register, Integer> {
//	Optional<Register> findById(Integer userId);
}
