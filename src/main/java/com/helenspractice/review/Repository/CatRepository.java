package com.helenspractice.review.Repository;


import com.helenspractice.review.Entity.BigCats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<BigCats, Long> {
}
