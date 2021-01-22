public class UniversitY {
    public static void main (String[] args){

        Students students = new Students("Кирилл", 7, "1A");
        System.out.println(students.getName() + " " + students.getAge() + " " + students.getSchoolClass());
    }
}

