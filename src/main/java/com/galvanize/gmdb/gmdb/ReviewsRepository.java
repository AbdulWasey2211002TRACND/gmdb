package com.galvanize.gmdb.gmdb;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews,Long> {
    List <Reviews> findByid(int id);

}
