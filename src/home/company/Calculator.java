package home.company;

public class Calculator {
    public Calculator(){}
    public void Enter(String str) throws Exception {
        String[] arr = str.split(" ");
        int first, second, temp;

        temp = Convert.arabToArab(arr[0]);
        if (temp != 0) {
            first = temp;
            temp = Convert.arabToArab(arr[2]);
            if (temp != 0){
                second = temp;
                int arabian = c(first,second,arr[1]);
                System.out.println(arabian);
            }
            else {
                throw new Exception("Неправильные данные");
            }
        }
        else {
            temp = Convert.romeToArab(arr[0]);
            if (temp != 0){
                first = temp;
                temp = Convert.romeToArab(arr[2]);
                if (temp != 0){
                    second = temp;
                    int arabian = c(first,second,arr[1]);
                    if (arabian < 1)
                        throw new Exception("Неправильные данные");
                    else
                        System.out.println(Convert.toRoman(arabian));
                }
                else {
                    throw new Exception("Неправильные данные");
                }
            }
            else {
                throw new Exception("Неправильные данные");
            }
        }
    }
    private int c (int first, int second, String sign) throws Exception {
        int it;
        if (sign.equals("+")){
            it = first + second;
        }
        else if (sign.equals("/")){
            it = first / second;
        }
        else if (sign.equals("-")){
            it = first - second;
        }
        else if (sign.equals("*")){
            it = first * second;
        }
        else {
            throw new Exception("Неправильные данные");
        }
        return it;
    }

}
