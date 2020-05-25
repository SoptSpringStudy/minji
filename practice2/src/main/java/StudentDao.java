import java.util.HashMap;
import java.util.Map;

public class StudentDao {
    private int key=0;
    private Map<String, Object> map = new HashMap<String, Object>();

    public void insert(Student student){
        map.put(Integer.toString(key),student); //key는 0부터 들어감
        key++;
        //kdy와 Student의 name이 value로 들어감
        map.forEach((key, value) -> System.out.println("key: "+key+" , value: "+((Student)value).name));
    }
}
