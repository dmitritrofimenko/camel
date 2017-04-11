package com.trofimenko;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by user on 4/10/2017.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("works now");
        CamelContext context=new DefaultCamelContext();

    }
}
