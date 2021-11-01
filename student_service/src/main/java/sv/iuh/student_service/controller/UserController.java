package sv.iuh.student_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.iuh.student_service.VO.ResponseTemplateVO;
import sv.iuh.student_service.entity.Student;
import sv.iuh.student_service.service.StudentService;

//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RestController
@RequestMapping("/students")
//@EnableEurekaClient
public class UserController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student saveUser(@RequestBody Student student){

        return studentService.saveUser(student);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                                Long userId){
        return studentService.getUserWithDepartment(userId);
    }

}
