#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(int argc,char const * argv[])
{
    int num1,num2;
    char *operation;
//     char *p;
//     //printf("Want to continue then enter continue %s/n",p);
//    // gets(p);
//     p=argv[1];
//     while (strcmp(p,"continue")==0)
//     {   
//         int i=1;
        operation=argv[2];
        num1=atoi(argv[3]);
        num2=atoi(argv[4]);
        

        if (strcmp(operation,"sum")==0){
            printf("Sum of to no. is %d\n",(num1 + num2));
        }
        else if (strcmp(operation,"sub")==0){
            printf("Sub of to no. is %d\n",(num1 - num2));
        }
        else if (strcmp(operation,"multiply")==0){
            printf("Multiply of to no. is %d\n",(num1 * num2));
        }
        else if(strcmp(operation,"divide")==0)
        {
            printf("Divide of to no. is %d\n",(num1 / num2));
        }
    //     p=argv[4+i]
    // }
    
    
    
    return 0;
}