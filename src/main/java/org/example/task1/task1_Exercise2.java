package org.example.task1;

public class task1_Exercise2 {
    //public class Exercise2 {

        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("[Error] No command line arguments");
            } else {
                for (String arg : args) {
                    System.out.println(arg);
                }
            }
        }
    }
//}
