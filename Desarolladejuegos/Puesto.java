//class Puesto.java
   import static javax.swing.JOptionPane.*;  //Fernando Manuel Avila Cataño SEPTIEMBRE 2012 
   import java.io.*;                

   public class Puesto
   {
      Desarrolladora desa=new Desarrolladora();
      public static String nombre_puesto[] = new String[10];
      String cate_puesto[] = new String[10];
      int capacidad[] = new int[10];
      int n=0;
      public void leer()
      {
         nombre_puesto[n]=showInputDialog("Nombre del puesto:");
         cate_puesto[n]=showInputDialog("Categoria del puesto:");
         capacidad[n]=Integer.parseInt(showInputDialog("Capacidad del puesto:"));
         n++;
      }
      public void mostrar()
      {
         for(int con=0;con<n;con++)
         {
            showMessageDialog(null,"Datos del Puesto:\n Nombre: "+nombre_puesto[con]+"\n Categoria Puesto: "+cate_puesto[con]+"\n Capacidad: "+capacidad[con]+"\n.",desa.nombre_empre+" Empleado No:"+con,INFORMATION_MESSAGE);
         }
      }
   }