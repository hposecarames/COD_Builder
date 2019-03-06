
package cod_builder;

/**
 *
 * @author Hector Pose Carames
 */
public class Pizza {
        
    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    public Pizza(float grHarina, float mlAgua, float grSal, float mlAceite, String tipoAceite, float grTomate, float grQueso, String tipoQueso, float grPinha) {
        
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", tipoAceite=" + tipoAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", tipoQueso=" + tipoQueso + ", grPinha=" + grPinha + '}';
    }

}

