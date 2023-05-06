#include <stdio.h>

int fibonacci(int n);
int fib1,fib;

int main(){
    int n;//,j;
    n=&n;//&j;
    printf("Enter the terms of fibonacci series: \n");
    scanf("%d",n);
    fibonacci(n);
}

int fibonacci(int n){
    fib1=0;
    fib=1;
    for(int i=1;i<=n;i++){
        
        fib=fib+fib1;
        fib1=fib-fib1;
        printf("Fibonacci series=%d\n",fib);
    }
};