package sv.iuh.student_service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sv.iuh.student_service.entity.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseTemplateVO {
    private Student student;
    private Faculty faculty;
}
