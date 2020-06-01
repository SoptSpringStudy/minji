import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] name = {"mj", "hs", "gs", "dk", "hw"};
        int[] age = {24,24,23,26,24};
        String[] soptDept = {"server", "android","server","server","android"};

        // 스프링 컨테이너 생성
//        String[] ctxs = {"classpath:appCtx1.xml"};
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(ctxs);

        // 자바파일 스프링 컨테이너 생성
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);

        // 학생 목록 등록
        StudentRegisterService registerService = ctx.getBean("studentRegisterService", StudentRegisterService.class);
        for(int i=0; i< name.length; i++) {
            Student student = new Student(name[i], age[i], soptDept[i]);
            registerService.register(student);
        }


        // 학생 목록 검색
        StudentSearchService searchService = ctx.getBean("studentSearchService", StudentSearchService.class);
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 학생의 키 번호를 입력하세요: ");
        String s_num = sc.next();

        searchService.search(Integer.parseInt(s_num));;

        ctx.close();
    }
}


