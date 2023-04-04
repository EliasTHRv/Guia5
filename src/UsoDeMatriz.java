/**
 *
 * @author elias
 */
public class UsoDeMatriz {
    public static void main(String[] args) {
        int[][] matriZ= new int[4][4];
//                matriZ[0][0]=2; se puede asignar valores de esta forma
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriZ[i][j]=1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriZ[i][j]+"]");
            }
            System.out.println(" ");
        }
        
    }
}
