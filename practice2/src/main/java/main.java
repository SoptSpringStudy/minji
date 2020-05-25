import org.springframework.context.support.GenericXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        String[] ctxs = {"classpath:appCtx1.xml", "classpath:appCtx2.xml", "classpath:appCtx3.xml"};
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(ctxs);

        //introduce it = ctx.getBean("introduce_id",introduce.class);
        StudentService studentService = ctx.getBean("studentService",StudentService.class); //자동주입으로 가져온 service객체
        Student student1 = ctx.getBean("student1", Student.class); //appCtx2.xml에서 가져온 학생1 객체
        Student student2 = ctx.getBean("student2", Student.class); //appCtx3.xml에서 가져온 학생1 객체

        //it.introMyself();
        studentService.register(student1);
        studentService.register(student2);
    }
}
