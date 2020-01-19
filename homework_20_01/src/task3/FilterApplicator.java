package task3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class FilterApplicator<T> {
    public static <T> Collection<T> filter (Collection<T> collection, Filter filter){
        return filter.filter(collection);
    }



    public static List<Student> sort(List <Student> collection){
        collection.sort(Student::compareTo);
        return collection;
    }
}
