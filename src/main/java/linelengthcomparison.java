import java.util.Scanner;

public class linelengthcomparison {

    public static <LineLengthComparison> void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        linelengthcomparison linecompare = new linelengthcomparison();
        linecompare.getlength();
    }

    public void getlength() {
        Scanner sc = new Scanner(System.in);
        int x1, x2, x3, x4, y1, y2, y3, y4;
        System.out.println("Enter a x1 and y1 value of a first point of line1: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter a x2 and y2 value of a first point of line1: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter a x3 and y3 value of a first point of line1: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter a x4 and y4 value of a first point of line1: ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        int length1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int length2 = (int) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        Integer linelength1 = new Integer(length1);
        Integer linelength2 = new Integer(length2);
        if(linelength1.equals(linelength2)) {
            System.out.println("Lines are equal");
        } else{
            System.out.println("Lines are not equal");
        }

    }
}
