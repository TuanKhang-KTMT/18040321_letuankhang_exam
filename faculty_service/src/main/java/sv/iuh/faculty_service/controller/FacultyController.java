package sv.iuh.faculty_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.iuh.faculty_service.entity.Faculty;
import sv.iuh.faculty_service.service.FacultyService;

@RestController
@RequestMapping("/faculty")
@Slf4j
public class FacultyController {

    @Autowired
    private FacultyService facultyService;


    @PostMapping("/")
    public Faculty saveFa(@RequestBody Faculty faculty){
        log.info("inside save faculty method if Department controller!");
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    public Faculty findFaculty(@PathVariable("id") Long id){
        log.info("inside findDeparmentById method if Department controller!");
        return facultyService.findById(id);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Khang!";
    }
}
