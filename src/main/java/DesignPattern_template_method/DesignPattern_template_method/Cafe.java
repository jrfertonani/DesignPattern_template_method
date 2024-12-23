package DesignPattern_template_method.DesignPattern_template_method;

import java.util.Random;

public class Cafe extends Bebida{
    @Override
    protected boolean possuiIngredientesParaBebida() {
        System.out.println("Indo ao banco de dados e validando se possui iingredientes para cafe!");
        return new Random().nextBoolean();
    }

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando ingrediente para o cafe..");
    }

    @Override
    protected void fazerBebida() {
        System.out.println("Fazendo o cafe..");
    }
}
