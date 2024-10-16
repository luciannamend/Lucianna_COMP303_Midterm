package com.lucianna.mendonca.lucianna_comp303_midterm.repository;

import com.lucianna.mendonca.lucianna_comp303_midterm.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
