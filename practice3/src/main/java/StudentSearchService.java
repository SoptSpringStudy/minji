

import org.springframework.beans.factory.annotation.Autowired;

public class StudentSearchService {
    @Autowired
    private StudentDao studentDao;

    public StudentSearchService(){}

    public StudentSearchService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void search(int stuNum){
        studentDao.select(stuNum);
        System.out.println("검색되었습니다.");
    }
    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }

}
