public class StudentExamResults {

    public static class Student {
        private int rollNo;

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }
    }

    public static class Test extends Student {
        protected double sub1;  
        protected double sub2; 

        public double getMarks() {
            return sub1 + sub2;  
        }

        public void setMarks(double sub1, double sub2) {
            this.sub1 = sub1;
            this.sub2 = sub2;
        }
    }

    public interface Sports {
        double sMarks = 20;  

        void set(); 
    }

    public static class Result extends Test implements Sports {

        private double sportsMarks;

        @Override
        public void set() {
            sportsMarks = sMarks; 
        }

        public void display() {
            System.out.println("Roll No: " + getRollNo());
            System.out.println("Marks in Subject 1: " + sub1);
            System.out.println("Marks in Subject 2: " + sub2);
            System.out.println("Sports Marks: " + sportsMarks);
            System.out.println("Total Marks: " + (getMarks() + sportsMarks));
        }
    }

    public static void main(String[] args) {
        Result studentResult = new Result();

        studentResult.setRollNo(101);
        studentResult.setMarks(85.5, 90.0);
        studentResult.set();  

        studentResult.display();
    }
}
