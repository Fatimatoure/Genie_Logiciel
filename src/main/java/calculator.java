public class calculator {
    /**************Méthode pour faire l'addition de deux chiffres************/
    public static int sum(int a, int b)
    {
        int c= a+b;
        return c;
    }

    /**************Méthode pour faire la soustraction de deux chiffres************/
    public static int minus(int a, int b)
    {
        int c= a-b;
        return c;
    }

    /**************Méthode pour faire la division de deux chiffres************/
    public static int divid(int a, int b)
    {
        int c= a/b;
        return c;
    }

    /**************Méthode pour faire la multiplication de deux chiffres************/
    public static int multiply(int a, int b)
    {
        int c= a*b;
        return c;
    }

    /**************Méthode pour connaitre la somme de deux chiffres************/

    public int min(int a, int b){

        return Math.min(a,b);
    }

    /**************Méthode pour faire le minimum de deux chiffres************/

    public int max(int a, int b){

        return Math.max(a,b);
    }

    /**************Méthode qui retourne le plus petit élément d’une liste************/
    public int minElement(int array[]){
        int k =array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<k){
                k=array[i];
            }
        }
        return k;

    }

    /**************Méthode  qui retourne le plus grand élément d’une liste************/
    public int maxElement(int array[]){
        int k =array[0];
        for(int i=1; i<array.length; i++){
            if(array[i] >k){
                k=array[i];
            }
        }
        return k;
    }

}
