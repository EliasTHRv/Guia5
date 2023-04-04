
/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo
 * de dato de tal manera que te permita alojar sus nombres más adelante.
 *
 * @author elias
 */
public class UsoDeVector {

    public static void main(String[] args) {
        String[] equiPo = new String[7];
        
        for (int i = 0; i < 7; i++)
        {
            equiPo[i] = "S";
        }
        for (int i = 0; i < 7; i++)
        {
            System.out.print(" "+"[" +equiPo[i]+"]");
        }
    }
}
