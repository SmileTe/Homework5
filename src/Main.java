public class Main {
    public static void main(String[] args) {
        //Задание 1
        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = new double[] {1.57, 7.654, 9.986};
        char[] array3 = new char[] {33, 62,98};

        //Задание 2
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "");
            if (i<array1.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "");
            if (i<array2.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "");
            if (i<array3.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    //Задание 3
        for (int i = array1.length; i > 0; i--) {
            System.out.print(array1[i-1] + "");
            if (i>1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array2.length; i > 0; i--) {
            System.out.print(array2[i-1] + "");
            if (i>1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array3.length; i > 0; i--) {
            System.out.print(array3[i-1] + "");
            if (i>1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задание 4
        for (int i = 0; i < array1.length; i++) {
            int EvenNumber = array1[i];
            if (EvenNumber%2!=0){
                EvenNumber = array1[i] + 1;
            }
            System.out.println(EvenNumber);
        }
    }





}