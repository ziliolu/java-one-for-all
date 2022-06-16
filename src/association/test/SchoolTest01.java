package association.test;

import association.domain.Professor;
import association.domain.School;

//Unidirectional association many to one
public class SchoolTest01 {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Maria");
        Professor prof2 = new Professor("Joao");
        Professor[] professors = {prof1, prof2};
        School school1 = new School("Objetivo", professors);

        school1.print();

    }
}
