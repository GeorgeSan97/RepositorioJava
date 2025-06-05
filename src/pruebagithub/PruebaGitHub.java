
package pruebagithub;

/* 
    Realizado por: Jorge Sánchez 
 */
public class PruebaGitHub {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 2;
        int num2 = 6; 
        int suma= 0;
        suma = num1+num2;
        
        System.out.println("Los números ingresados son: " + num1 + " y " + num2);
        System.out.println("La suma es: "+suma);
        System.out.println("Me encuentro actualizando el código");
        System.out.println("Limpiando mi código ");
        System.out.println("Programa terminado");
        System.out.println("Última modificación");
    }
    
}


/*
IMPORTANTE: Para que GitHub reconozca los cambios 
            que hice en el código primero debo guardar 
            los cambios en el NetBenas

    git status
    git add .
    git status
    git commit -m "Última modificación"
    git push origin master
*/