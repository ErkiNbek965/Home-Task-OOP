import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = 1000;
        Account person = new Account();
        person.userName = "Уважаемый наш клиент```";
        person.operator = "Мегаком";
        System.out.println("вводите данные "+person.userName );
        System.out.println("Вас приветсвует оператор "+person.operator);
        double a = scan.nextDouble();
        person.balance = a;
        if (a < 1000){
            System.out.println("Вывод средтсв невозможен"+"<"+balance);
        }
        else if  (a > 1000){
            System.out.println("Вывод средств возможен"+">"+balance);
        }
        System.out.println("Cпасибо что выбрали нас ");
    //    person.Deposit();
        person.withdrawal();


        }


    }
