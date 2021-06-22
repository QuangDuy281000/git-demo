package test;

import java.util.ArrayList;
import java.util.List;

public class dao {
    public  static List<users> cc(){
        List<users> list = new ArrayList<users>();
        list.add(new users("admin","123"));
        list.add(new users("duy","32"));
        return  list;
    }
}
