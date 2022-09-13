public class Question4{
    public static void main(String args[]){
        int number_1 = 89;
        int number_2 = 52426;

        //Using temp variable
        System.out.println("Before swaping:" + "x=" + number_1 + " and y=" + number_2);
        int number_3 = number_1;
        number_1 = number_2;
        number_2 = number_3;
        System.out.println("After swaping:" + "x=" + number_1 + " and y=" + number_2);
        System.out.println();

        //Without using temp variable
        System.out.println("Before swaping:" + "x=" + number_1 + " and y=" + number_2);
        number_1 = number_1 * number_2;
        number_2 = number_1/number_2;
        number_1 = number_1/number_2;
        System.out.println("After swaping:" + "x=" + number_1 + " and y=" + number_2);
    }
}