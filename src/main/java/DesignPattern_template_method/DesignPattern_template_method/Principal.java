package DesignPattern_template_method.DesignPattern_template_method;

import org.springframework.boot.SpringApplication;

public class Principal {

    public static void main(String[] args) {
        Bebida bebida = new Cerveja();
        try{
            bebida.prepararBebida();
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        bebida.prepararBebida();
    }


}
