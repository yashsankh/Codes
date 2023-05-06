#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>

int x,b,c,d;

int Edistance(int x1,int y1,int x2,int y2){

    int i;
    i=((y2-y1)*(y2-y1))+((x2-x1)*(x2-x1));
    return sqrt(i);
}

float areaofcircle(int (*f)(int,int,int,int))
{

   float a;
   a = (3.14) * (f(x,b,c,d)*f(x,b,c,d));
   return a;
}

//Note : in c ^... power to number is not excepted in c, we use pow( ) function to do so.

int main()
{
    int (*p)(int,int,int,int);
    p=&Edistance;
    printf("Enter the 2 co-ordinates of any point x & y resp.\n");
    scanf("%d %d %d %d",&x,&b,&c,&d);
    printf("The distance between 2 co-ordinates is %d\n",p(x,b,c,d));
    printf("The area of circle is %f\n",areaofcircle(p));
    free(p);
    
    return 0;
}