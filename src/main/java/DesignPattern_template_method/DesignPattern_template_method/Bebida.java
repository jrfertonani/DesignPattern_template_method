package DesignPattern_template_method.DesignPattern_template_method;

public abstract class Bebida {

    public void prepararBebida(){
        if (possuiIngredientesParaBebida()) {
            prepararIngredientes();
            fazerBebida();

            return;
        }
        throw new RuntimeException("Não possui ingredientes...");
    }
    protected  abstract boolean possuiIngredientesParaBebida();
    protected  abstract void prepararIngredientes();
    protected  abstract void fazerBebida();
}
