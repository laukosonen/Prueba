public class EjemploGithub {
    public static void main (String [] args){
        //Crea dos ArrayList de números y guarda de forma aleatorio 20 números sin decimales
        // en cada uno de ellos. Una vez hecho esto comprueba cuantos números de los dos arraylist
        // son iguales (mismo número en la misma posición). Tras hacer la comprobación
        // indica cuantos números han sido iguales

        //COMENTARIO DE PRUEBA
        //nuevo comentario

        int[]array1=new int[20];
        int[]array2=new int[20];
        int contador=0;

        for (int i = 0; i < 20; i++)
        {
            array1[i]=(int)(Math.random()*21);
            array2[i]=(int)(Math.random()*21);
        }

        for (int i = 0; i < 20; i++)
        {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++)
        {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < 20; i++)
        {
            if(array1[i]==array2[i])
            {
                System.out.println("El número"+" "+array1[i]+" "+"está por igual en los dos arrays");
                contador++;
            }
        }
        System.out.println("Han salido"+" "+contador+" "+"números iguales");
    }
}


