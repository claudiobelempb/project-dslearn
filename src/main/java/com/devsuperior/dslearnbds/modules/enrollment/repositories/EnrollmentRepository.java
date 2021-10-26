package com.devsuperior.dslearnbds.modules.enrollment.repositories;

import com.devsuperior.dslearnbds.modules.enrollment.entities.Enrollment;
import com.devsuperior.dslearnbds.modules.enrollment.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
