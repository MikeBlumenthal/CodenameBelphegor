package com.codeclan.example.opensaucebackend.repository.measures;

import com.codeclan.example.opensaucebackend.models.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<Measure, Long>, MeasureRepositoryCustom {

}
