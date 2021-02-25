package com.lineate.bench.pattern.composite.exercise;

public class College {

    public static void main(String[] args) {

        Faculty mathProf1 = new Professor("Jonh Smith", "Associate Professor", 401);
        Faculty mathProf2 = new Professor("Bill Jackson", "Full Professor", 403);
        Supervisor mathChair = new Supervisor("Edvin Stockman", "Chair of the Math Department");
        mathChair.addFaculty(mathProf1);
        mathChair.addFaculty(mathProf2);

        Faculty csProf1 = new Professor("Roger Carpenter", "Associate Professor", 501);
        Faculty csProf2 = new Professor("Richard Capmpbel", "Adjunct Professor", 502);
        Faculty csProf3 = new Professor("Steven Kent", "Full Professor", 503);
        Supervisor csChair = new Supervisor("Samantha Fox", "Chair of the Computer Science Department");
        csChair.addFaculty(csProf1);
        csChair.addFaculty(csProf2);
        csChair.addFaculty(csProf3);

        Supervisor dean = new Supervisor("Bob Graham", "Dean of the Technology College");
        dean.addFaculty(mathChair);
        dean.addFaculty(csChair);

        dean.showDetails("");

        csChair.removeFaculty(csProf2);

        System.out.println();
        dean.showDetails("");
    }
}
