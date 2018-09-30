#include<stdio.h>

int i,j,maxim; //Contadores Globales

int main() {

    printf("Valores para cada tipo de valor numerico, en las cuales se presenta OverFlow\n\n");
    printf("Ingrese el valor maximo para el cual quiera verificar Overflow\n(Se recomenda probar con 100)\n");
    scanf("%i",&maxim);
    fibShort(maxim);
    fibInt(maxim);
    fibLong(maxim);
    fiblLong(maxim);
    printf("Para el caso del FLOAT no se presenta OverFlow para valores de hasta %i\n", maxim);
    fibFloat(maxim);
    printf("Para el caso del DOUBLE no se presenta OverFlow para valores de hasta %i\n", maxim);
    fibDouble(maxim);
    return(0);
}

void fibShort(int n) {
    int fib = 0, x = 0;//Variables para verificar el OverFlow
    for (i = 0; i <= n; i++){
        short a = 0, b = 1, f = 0;//Declaracion de varibles para el calculo del fibonacci
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib){//se comprueba que no exista Overflow, en caso de que ocurra, se para la ejecucion y se devuelven los valores correspondientes
            printf("Se produce Overflow en SHORT numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
            break;
        } fib = x;
    }
}

void fibInt(int n) {
    int fib = 0, x = 0;
    for (i = 0; i <= n; i++){
        int a = 0, b = 1, f = 0;
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib) {
            printf("Se produce Overflow en INT numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
            break;
        } fib = x;
    }
}

void fibLong(int n) {
    long fib = 0, x = 0;
    for (i = 0; i <= n; i++){
        long a = 0, b = 1, f = 0;
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib) {
            printf("Se produce Overflow en LONG numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
            break;
        } fib = x;
    }
}

void fiblLong(int n) {
    long long fib = 0, x = 0;
    for (i = 0; i <= n; i++){
        long long a = 0, b = 1, f = 0;
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib) {
            printf("Se produce Overflow en LONG LONG numero %d, ultimo posible valor calculado %d = %lld\n", i, i-1, fib);
            break;
        } fib = x;
    }
}

void fibFloat(int n) {
    /* Se prueba para que calcule valores hasta de 1.000 pero no se presenta OverFlow*/
    float fib = 0, x = 0;
    for (i = 0; i <= n; i++){
        float a = 0, b = 1, f = 0;
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib) {
            printf("Se produce Overflow en FLOAT numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
            break;
        } fib = x;
    }
}

void fibDouble(int n) {
    /* Se prueba para que calcule valores hasta de 1.000 pero no se presenta OverFlow*/
    double fib = 0, x = 0;
    for (i = 0; i <= n; i++){
        double a = 0, b = 1, f = 0;
        for (j = 0; j < i; j++) {
            f = a+b;
            a = b;
            b = f;
        } x = f;
        if(x < fib) {
            printf("Se produce Overflow en DOUBLE numero %d, ultimo posible valor calculado %d = %d\n", i, i-1, fib);
            break;
        } fib = x;
    }
}
