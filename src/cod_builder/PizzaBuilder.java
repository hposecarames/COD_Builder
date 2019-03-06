
package cod_builder;

/**
 *
 * @author Hector Pose Carames
 */
public class PizzaBuilder {
    
    private final float grHarina;
    private final float mlAgua;
    private float grSal = 0;
    private float mlAceite = 0;
    private String tipoAceite = "";
    private float grTomate = 0;
    private float grQueso = 0;
    private String tipoQueso = "";
    private float grPinha = 0;

    public PizzaBuilder(final float grHarina, final float mlAgua) {

        this.grHarina = grHarina;
        this.mlAgua = mlAgua;

    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;

    }

    public Pizza createPizza() {

        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);

    }

}

