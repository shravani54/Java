class Student {
    int roll_no;

    void getRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Result student = new Result();
        student.getRollNo(101);
        student.getMarks(85, 90);

        student.displayRollNo();
        student.displayMarks();
        student.displayResult();
    }
}