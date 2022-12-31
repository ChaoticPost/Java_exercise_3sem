package org.example.task28;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String input_string;

        Scanner scanner = new Scanner(System.in);
        input_string = scanner.nextLine();

        //Написать   регулярное   выражение,   определяющее   является   ли   данная   строка   строкой "abcdefghijklmnopqrstuv18340" или нет.
        while(!input_string.equals("000"))
        {
            Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
            System.out.println(pattern.matcher(input_string).matches());

            input_string = scanner.nextLine();
        }

        input_string = scanner.nextLine();
        //Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
        while(!input_string.equals("000"))
        {
            Pattern pattern = Pattern.compile("(\s?[0-9]+(.[0-9]+)*\s?(USD|RUB|EU))+");
            Matcher matcher = pattern.matcher(input_string);
            System.out.println(matcher.matches());

            input_string = scanner.nextLine();
        }

        input_string = scanner.nextLine();
        //Дан текст, необходимо проверить есть ли в тексте цифры, за которыми не стоит знак «+».
        while(!input_string.equals("000"))
        {
            Pattern pattern = Pattern.compile(".*[0-9]\\+.*");
            Matcher matcher = pattern.matcher(input_string);
            System.out.println(matcher.matches());

            input_string = scanner.nextLine();
        }

        /*
        input_string = scanner.nextLine();
        //Написать регулярное выражение, определяющее является ли данная строчка датой в формат dd/mm/yyyy. Начиная с 1900 года до 9999 года.
        while(!input_string.equals("000"))
        {
            Pattern pattern = Pattern.compile("(((0[1-9]|[12][0-9]|3[01])/((0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)/(0[469]|11))|(0[1-9]|[1][0-9]|2[0-8])/(02))/([1-9][0-9]{2}[1-9]|[1-9][0-9][1-9][0-9]{1}|[1-9][1-9][0-9]{2}|[1-9][0-9]{3}))|(29/02/(([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00)))");
            Matcher matcher = pattern.matcher(input_string);

            System.out.println(matcher.matches());

            input_string = scanner.nextLine();
        }
        */

        input_string = scanner.nextLine();
        //Написать регулярное выражение, определяющее является ли данная строчка допустимым (корректным) е-mail адресом согласно RFC под номером 2822.
        while (!input_string.equals("000")) {
            Pattern pattern = Pattern.compile("[0-9a-zA-Z-_.]+@[a-z]+.[a-z]+");
            Matcher matcher = pattern.matcher(input_string);
            System.out.println(matcher.matches());

            input_string = scanner.nextLine();
        }

        input_string = scanner.nextLine();
        //Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или
        //более символов. Где символом может быть цифр, английская буква, и знак подчеркивания. Пароль
        //должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
        while (!input_string.equals("000")) {
            Pattern pattern = Pattern.compile("((?=^.{8,}$)(?=.*\\d)(?=.*[_])(?=.*[A-Z])(?=.*[a-z])).*$");
            Matcher matcher = pattern.matcher(input_string);
            System.out.println(matcher.matches());

            input_string = scanner.nextLine();
        }
    }
}

