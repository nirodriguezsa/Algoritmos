package fibonacci;

public class Fibonnn {

    
    public static void main(String[] args) {
    	int maxim = 100;
    	System.out.println("Valores para cada tipo de valor numerico, en las cuales se presenta OverFlow\n");
    	System.out.println("Para todos los casos se utiliza un valor de 100\n");
        fibShort(maxim);
        fibInt(maxim);
        fibLong(maxim);
        fibFloat(maxim);
        System.out.format("Para el caso del FLOAT no se presenta OverFlow para valores de hasta %d\n", maxim);
        fibDouble(maxim);
        System.out.format("Para el caso del DOUBLE no se presenta OverFlow para valores de hasta %d\n", maxim);
    }
    
    public static void fibShort(int n) {
    	int fib = 0, x = 0,i;//Variables para verificar el OverFlow
        for (i = 0; i <= n; i++){
            short a = 0, b = 1, f = 0,j;//Declaracion de varibles para el calculo del fibonacci
            for (j = 0; j < i; j++) {
                f = (short) (a+b);
                a = b;
                b = f;
            } x = f;
            if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
                System.out.format("Se produce Overflow en SHORT numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
                break;
            } fib = x;
        }
    }
    
    public static void fibInt(int n) {
    	int fib = 0, x = 0,i;//Variables para verificar el OverFlow
        for (i = 0; i <= n; i++){
            int a = 0, b = 1, f = 0,j;//Declaracion de varibles para el calculo del fibonacci
            for (j = 0; j < i; j++) {
                f = a+b;
                a = b;
                b = f;
            } x = f;
            if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
                System.out.format("Se produce Overflow en INT numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
                break;
            } fib = x;
        }
    }
    
    public static void fibLong(int n) {
    	long fib = 0, x = 0,i;//Variables para verificar el OverFlow
        for (i = 0; i <= n; i++){
            long a = 0, b = 1, f = 0,j;//Declaracion de varibles para el calculo del fibonacci
            for (j = 0; j < i; j++) {
                f = a+b;
                a = b;
                b = f;
            } x = f;
            if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
                System.out.format("Se produce Overflow en LONG numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
                break;
            } fib = x;
        }
    }
    
    public static void fibFloat(int n) {
        /* Se prueba para que calcule valores hasta de 1.000 pero no se presenta OverFlow*/
    	float fib = 0, x = 0,i;//Variables para verificar el OverFlow
        for (i = 0; i <= n; i++){
            float a = 0, b = 1, f = 0,j;//Declaracion de varibles para el calculo del fibonacci
            for (j = 0; j < i; j++) {
                f = a+b;
                a = b;
                b = f;
            } x = f;
            if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
                System.out.format("Se produce Overflow en LONG numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
                break;
            } fib = x;
        }
    }
    public static void fibDouble(int n) {
        /* Se prueba para que calcule valores hasta de 1.000 pero no se presenta OverFlow*/
    	double fib = 0, x = 0,i;//Variables para verificar el OverFlow
        for (i = 0; i <= n; i++){
            double a = 0, b = 1, f = 0,j;//Declaracion de varibles para el calculo del fibonacci
            for (j = 0; j < i; j++) {
                f = a+b;
                a = b;
                b = f;
            } x = f;
            if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
                System.out.format("Se produce Overflow en LONG numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
                break;
            } fib = x;
        }
    }
}
