public class NumberofStudentsUnabletoEatLunch1700 {
    public static int countStudents(int[] students, int[] sandwiches) {
        int preferZero = 0; int preferOne = 0;
//        Count student preference of which sandwich
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                preferZero++;
            } else {
                preferOne++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++){
            if (sandwiches[i] == 1) {
                if (preferOne != 0) {
                    preferOne--;
                } else {
                    return preferZero;
                }
            } else {
                if (preferZero != 0) {
                    preferZero--;
                } else {
                    return preferOne;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }
}
