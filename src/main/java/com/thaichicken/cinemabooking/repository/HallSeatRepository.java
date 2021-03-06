package com.thaichicken.cinemabooking.repository;

import com.thaichicken.cinemabooking.model.HallSeatEntity;
import com.thaichicken.cinemabooking.model.HallSeatEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallSeatRepository extends JpaRepository<HallSeatEntity, HallSeatEntityPK> {
}
