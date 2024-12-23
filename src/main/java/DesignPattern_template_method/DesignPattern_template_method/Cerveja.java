package DesignPattern_template_method.DesignPattern_template_method;

import java.util.Random;

public class Cerveja extends Bebida{
    @Override
    protected boolean possuiIngredientesParaBebida() {
        System.out.println("Indo ao banco de dados e validando se possui iingredientes para cerveja!");
        return new Random().nextBoolean();
    }

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingrediente para o cerveja..");
    }

    @Override
    protected void fazerBebida() {
        System.out.println("Fazendo o cerveja..");
    }
}
