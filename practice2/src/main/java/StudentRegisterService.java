import org.springframework.beans.factory.annotation.Autowired;

public class StudentRegisterService {
    @Autowired
    private StudentDao studentDao;

    public StudentRegisterService(){}

    public StudentRegisterService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void register(Student student){
        studentDao.insert(student);
        System.out.println("등록되었습니다.");
    }

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }

}

