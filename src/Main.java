public class Main {
    public static void main(String[] args) {
        System.out.println(hello(30,20));
        System.out.println(hello(15,10));
        System.out.println(hello( 50,20));
        System.out.println(hello( 55,27));
        System.out.println(hello(34,55));
    }

    public static String hello(int age, int temperature){
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30){
            return " Можно идти гулять1";
        }else if (age < 20 && temperature > 0 && temperature < 28){
            return " Можно идти гулять2";
        }else if (age > 45 && temperature < 25 && temperature > -10){
            return " Можно идти гулять3";
        }else {
            return "остовайтесь дома";
        }
    }


}