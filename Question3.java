public class Question3{
    public static void main(String args[]){
        float number_1 = 2290.2782f;
        float number_2 = 39280.2729f;
        float quotient = number_1/number_2;
        int remainder = (int)(number_1%number_2);
        System.out.println(number_1+"/"+number_2);
        System.out.println("Quotient:"+quotient);
        System.out.println("Remainder:"+remainder);
    }
}