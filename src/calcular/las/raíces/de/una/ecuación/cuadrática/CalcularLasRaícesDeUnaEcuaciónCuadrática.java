
package calcular.las.raíces.de.una.ecuación.cuadrática;

import javax.swing.JOptionPane;

public class CalcularLasRaícesDeUnaEcuaciónCuadrática {

    public static void main(String[] args) {
       //Declaramos 4 variables de tipo String
        String numero1, numero2, numero3, opcion;
       //Declaramos 9 variables de tipo double
        double a, b, c, d=0, e=0, f=0, g=0, h=0, opcion2=0;
        //Instrucción do while
        do{
            //Métodos para ingresar los datos por los InputDialog
            numero1 = JOptionPane.showInputDialog("Escribe el coficiente a ");
            numero2 = JOptionPane.showInputDialog("Escribe el coficiente b ");
            numero3 = JOptionPane.showInputDialog("Escribe el coficiente c ");
            
            /*Métodos para convertir los datos ingresado por los InputDialog a enteros*/
            a = Integer.parseInt(numero1);
            b = Integer.parseInt(numero2);
            c = Integer.parseInt(numero3);
            
            /* Multiplicación de las variables a, c, b 
            y el resultado de las multiplicaciones se restarán y el resultado
            se almacena en la variable d */
            d = ((b*b)-(4*a*c));
            /* Multiplicación de la variable a 
            y el resultado se almacena en la variable e */
            e = ((2)*(a));
            //Condicion que evalúa la variable e si es menor o igual a 0
            if (e<=0) {
                /* Opción que despliega un InputDialog con la opción si no si el
                resultado es negativo */
               opcion = JOptionPane.showInputDialog("\n el coeficiente a es"
                        + " negativo, no se puede dividir / 0, Repetir 1-Si 2-No:" );
                /* Métodos para convertir el dato ingresado por el InputDialog
                   a un entero ya que si = 1 y no = 2 */
               opcion2 = Integer.parseInt(opcion);
               
            }else{
                //Condicion que evalúa la variable d si es menor o igual a 0
                if (d<=0) {
                    opcion = JOptionPane.showInputDialog("\n no existe raíz de un"
                        + " numero negativo, Repetir 1-Si 2-No:" ); 
                    opcion2 = Integer.parseInt(opcion);
                }else{
                    /* Método para sacar la raíz cuadrada del datos almacenado en 
                   la variable d y el resultado se almacena en la variable h*/
                 h = Math.sqrt(d);
                  /*a las variables b,e,h le haremos las funciones de suma resta
                 multiplicación y división */
                 f = (((-b)+(h))/e);
                 g = (((-b)-(h))/e);
                 /*Mensajes que muestran el resultado que esta almacenados en la
                   variable f, g */
                JOptionPane.showMessageDialog(null,"La raiz x1_:"+f,"resultado",JOptionPane.INFORMATION_MESSAGE); 
                JOptionPane.showMessageDialog(null,"la raíz x2_:"+g,"resultado",JOptionPane.INFORMATION_MESSAGE); 
                opcion=JOptionPane.showInputDialog("\n Repetir? 1-Si 2-No:" ); 
                opcion2 = Integer.parseInt(opcion);
                }
            }
        }while(opcion2==1);
    }
}
