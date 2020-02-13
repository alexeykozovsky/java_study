import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniversityMain {
    public static void main(String[] args) {

        University university = new University();
        SaveFile saveFile = new SaveFile();
        LoadFile loadFile = new LoadFile();

        File universityStudents = new File("UniversityStudents.txt");

//      1. Генерируем список из 100 студентов и сохраняем их в файл.
//         Если файл уже создан, то читаем файл
        if(universityStudents.exists()){
            university.setUniversityStudents(loadFile.load(universityStudents.getPath()));
        }else {
            List<Student> students = Stream
                    .generate(() -> new Student(university.randomName(5), (int)(Math.random()*10 + 1)))
                    .limit(100)
                    .collect(Collectors.toCollection(ArrayList::new));
            university.setUniversityStudents(students);
            saveFile.save(students, universityStudents.getPath());
        }
        System.out.println("Все студенты\n " + university.getUniversityStudents());
        System.out.println("Количество всех студентов: " + university.getUniversityStudents().size() + "\n");

        File filterStudents = new File("FilterStudents.txt");

//      3. Сортируем список по оценке по возрастанию и выбираем студентов с баллом меньше 7
        List<Student> badStudents = loadFile.load(universityStudents.getPath()).stream()
                .filter(Student -> Student !=null)
                .sorted(Comparator.comparing(Student::getMark))
                .filter(Student -> Student.getMark() < 7)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Студенты с баллом меньше 7\n " + badStudents);
        System.out.println("Количество студентов с баллом меньше 7: " + badStudents.size() + "\n");
        saveFile.save(badStudents, filterStudents.getPath());

//      Удаляем студентов с золотым билетом из списка студентов с баллом меньше 7
        List<Student> filterStudents2 = loadFile.load(filterStudents.getPath()).stream()
                .limit(badStudents.size()-3)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Студенты без сертификата \n" + filterStudents2);
        System.out.println("Количество студентов без сертификата: " + filterStudents2.size());
        saveFile.save(filterStudents2, filterStudents.getPath());
    }
}
