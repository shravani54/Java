public class Static {
    // Static variable
    static int count;

    // Static block
    static {
        System.out.println("Static block executed.");
        count = 10;
    }

    // Static method
    static void showCount() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");
        showCount();


        count += 5;
        showCount();
    }
}

