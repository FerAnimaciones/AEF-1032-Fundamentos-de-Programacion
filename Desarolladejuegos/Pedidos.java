//class Pedidos.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012 
   import java.io.*;                

   public class Pedidos
   {
      Desarrolladora desa=new Desarrolladora();
      public static String nombre_puesto[] = new String[10];
      String cate_puesto[] = new String[10];
      int capacidad[] = new int[10];
      int n=0;
      public void leer()
      {
         nombre_puesto[n]=showInputDialog("Nombre del los pedidos:");
         capacidad[n]=Integer.parseInt(showInputDialog("Dias de los pedias:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del los web masters:\n Nombre: "+nombre_puesto[con]+"\n Dia del dominio: "+capacidad[con]+"\n.",desa.nombre_empre+" Empleado No:"+con,INFORMATION_MESSAGE);
         }
      }
   }