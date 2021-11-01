package sv.iuh.faculty_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.iuh.faculty_service.entity.Faculty;
import sv.iuh.faculty_service.repository.FacultyRepository;

@Service
@Slf4j
//@RequiredArgsConstructor
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findById(Long id) {
        return facultyRepository.findById(id).get();
    }
}
