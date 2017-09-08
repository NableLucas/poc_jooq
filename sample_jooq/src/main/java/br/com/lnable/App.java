package br.com.lnable;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTransactionManagement
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
