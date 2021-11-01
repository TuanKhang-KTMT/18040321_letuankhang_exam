package sv.iuh.student_service.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.iuh.student_service.entity.Student;

@Repository
 public interface StudentRepository extends JpaRepository<Student, Long> {


}
