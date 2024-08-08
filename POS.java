import java.util.*;
public class POS
{
public static void main(String[]args)
{
    String NombreProducto;
    float vlrUnitario, vlrCobrar;
    final float IVA=0.19f;
    Scanner lector= new Scanner(System.in);
    System.out.println("ingrese el nombre del producto");
    NombreProducto=lector.nextLine();
    System.out.println("ingrese el valor unitario del prducto");
    vlrUnitario=lector.nextFloat();
    vlrCobrar=vlrUnitario + (vlrUnitario*IVA);

}
}