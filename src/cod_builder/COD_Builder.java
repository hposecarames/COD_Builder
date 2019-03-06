
package cod_builder;

/**
 *
 * @author Hector Pose Carames
 */
public class COD_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza miPizzaHawaiana= new PizzaBuilder(300,500)
                             .setGrQueso(200)
                             .setGrPinha(100)
                             .createPizza();
        System.out.print(miPizzaHawaiana);
    }
    
}
