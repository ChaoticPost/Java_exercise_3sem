package org.example.task25;

import java.util.Scanner;

public class ThrowsDemo
{
    public void getKey()
    {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");

        boolean flag = true;
        while(flag)
        {
            try
            {
                String key = myScanner.nextLine();
                printDetails(key);
                flag = false;
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    }

    public void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception
    {
        if(key.equals(""))
        {
            throw new Exception( "Key set to empty string" );
        }

        return "data for " + key;
    }
}



