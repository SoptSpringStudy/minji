import java.util.List;
import java.util.Map;

public class Student {
    String name;
    int age;
    String soptDept;
//    List<String> friends;
//    Map<String, String> proLangs;


    public Student(String name, int age, String soptDept) {
        this.name = name;
        this.age = age;
        this.soptDept = soptDept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSoptDept(String soptDept) {
        this.soptDept = soptDept;
    }
//
//    public void setFriends(List<String> friends) {
//        this.friends = friends;
//    }
//
//    public void setProLangs(Map<String, String> proLangs) {
//        this.proLangs = proLangs;
//    }
//
//    public void introMyself(){
//        System.out.println("이름: "+name);
//        System.out.println("나이: "+age);
//        System.out.println("SOPT 소속: "+soptDept);
//        System.out.println("친구: "+friends);
//        System.out.println("사용 프밍언어: "+proLangs);
//    }
}