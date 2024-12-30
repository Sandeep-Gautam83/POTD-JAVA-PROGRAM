import javax.naming.PartialResultException;
import java.util.Scanner;

public class MatrixPrint
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mat[][] = new int[3][3];
        int i,j;
        for( i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Print matrix number : ");
        for (i=0; i<=2; i++){
            for (j=0; j<=2; j++){
                System.out.print(mat[i][j]+ "\t" );
            }
            System.out.println();
        }
        System.out.println("Transpose matrix number ");
        for(i=0; i<=2; i++){
            for(j=0; j<=2;j++){
                System.out.print(mat[j][i]+ "\t");
            }
            System.out.println();
        }
    }
}
