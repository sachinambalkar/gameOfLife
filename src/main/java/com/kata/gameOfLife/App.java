package com.kata.gameOfLife;

import com.kata.gameOfLife.common.UtilHelper;
import com.kata.gameOfLife.common.UtilHelperImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UtilHelper utilHelper=new UtilHelperImpl();
        utilHelper.Start();
        
    }
}
