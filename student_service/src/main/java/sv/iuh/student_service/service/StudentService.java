package sv.iuh.student_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sv.iuh.student_service.VO.Faculty;
import sv.iuh.student_service.VO.ResponseTemplateVO;
import sv.iuh.student_service.entity.Student;
import sv.iuh.student_service.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Student saveUser(Student user) {
        return studentRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student = studentRepository.findById(userId).get();
        vo.setStudent(student);
        Faculty faculty =
                restTemplate.getForObject("http://localhost:9003/faculty/"
                                + student.getFacultyId(),
                        Faculty.class);

        vo.setFaculty(faculty);

        return vo;
    }
}
