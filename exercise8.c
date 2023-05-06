#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// Dynamic Memory Allocation
// ABC Pvt Ltd. manages employee records of other companies.
// Employee Id can be of any length and it can contain any character
// For 3 employees, you have to take 'length of employee id' as input in a length integer variable.
// Then, you have to take employee id as an input and display it on screen.
// Store the employee id in a character array which is allocated dynamically.
// You have to create only one character array dynamically
// EXAMPLE:
// Employee 1:
// Enter no of characters in your eId
// 45
// Dynamically allocate the character array.
// take input from user

// Employee 2:
// Enter no of characters in your eId
// 4
// Dynamically allocate the character array.
// take input from user

// Employee 3:
// Enter no of characters in your eId
// 9
// Dynamically allocate the character array.
// take input from user

int main()
{
    int *ptr, *ptr1;
    int n;
    printf("Enter the no employees info you have:\n");
    scanf("%d", &n);
    printf("\n");

    for (int i = 0; i < n; i++)
    {
        int j;//this code for name of employee
        printf("Enter no of letters in your name:\n");
        scanf("%d", &j);
        ptr1 = (char *)calloc((j+1), sizeof(char));
        printf("Enter your name:\n");
        scanf("%s", ptr1);
        
        //this code for id of employee
        int b;
        printf("\n");
        printf("Enter the no of characters in your employee id :\n");
        scanf("%d",&b);
        ptr = (char *)calloc((b+1), sizeof(char));
        printf("Enter the id of employee:\n");
        scanf("%s", ptr); 

        //this code for giving out put to code;
        printf("\n\n");
        printf("The name of employee:\n");
        printf("%s\n", ptr1);
        printf("The id of employee:\n");
        printf("%s\n", ptr);
        printf("\n\n");
    }
    
    
    
    free(ptr);
    free(ptr1);
    return 0;
}
//you can enter each element of array and run program
//be up-to-dated with pointer and using them with arrays


//discovery that ctrl + left click of mouse