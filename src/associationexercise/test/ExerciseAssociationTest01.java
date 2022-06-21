package associationexercise.test;

import associationexercise.domain.Place;
import associationexercise.domain.Professor;
import associationexercise.domain.Seminar;
import associationexercise.domain.Student;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {

        Place place = new Place("5th Avenue, NY");
        Student student1 = new Student("Luiza Zilio", 20);
        Student student2 = new Student("Mary", 24);
        Student[] seminarStudents = {student1, student2};
        Seminar seminar = new Seminar("Artificial Intelligence", seminarStudents, place);
        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("Joe Byron", "Java", availableSeminars);

        professor.print();



    }
}
