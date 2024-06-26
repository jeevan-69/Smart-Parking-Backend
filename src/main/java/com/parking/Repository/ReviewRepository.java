package com.parking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.Models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
