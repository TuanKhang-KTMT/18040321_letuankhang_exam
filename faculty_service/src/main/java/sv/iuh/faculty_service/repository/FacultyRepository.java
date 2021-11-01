package sv.iuh.faculty_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.iuh.faculty_service.entity.Faculty;

@Repository
public interface FacultyRepository
        extends JpaRepository<Faculty, Long> {

    //Department findDepartmentById(Long departmentId);
}

