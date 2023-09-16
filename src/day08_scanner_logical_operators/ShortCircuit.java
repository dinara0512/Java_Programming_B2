package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
/*

&&
---------------------------

    True && False --> True
    True && False --> False
    False && True --> False ---> if the first part is false, 2nd part i do not cara
    False & False --. false ---. if the first part is false, 2nd part i do not care

    int a = 10;
    System.out.println (false && (a++ > 11));
    System.out.println (false & (a++> 11));


    ||
    ------------------------
    False || False ---> False
    False||True--> True
    True || False --> True --> if the first part is True, 2nd part i do not care
    True || True --> True --> if the first part is True, 2nd part i do not care


    *** NOTE
    If we want still execute the 2nd EXPRESSION (2nd side), instead of && (andand),|| (oror)---> we can use & (and), |(or)




 */
        System.out.println(true ||5/10 ==0);
        //System.out.println(true | 5/0 == 0);

        System.out.println(false && 5/0==0);
        System.out.println(false & 5/0==0 );

    }


}
