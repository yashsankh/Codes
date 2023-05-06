#include <stdio.h>
#include <string.h>
#include <stdlib.h>
/*Imp Note:
In dynamic memory allocation we actually convert normal variable into array variable by 
actually increasing size of that variable dynamically and pointing all that spaces by 
single variables*/ 


int main()
{
    char *ptr;
    int n;
    printf("Enter the size of array u wnat for storing characters:\n");
    scanf("%d", &n);

    ptr = (char *)malloc(n * sizeof(char));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the %d element of array:\n", i);
        scanf("%s", &ptr[i]); // why instead of s it doesn't accept c,p
    }                         // why cc is weird for handling.
    for (int i = 0; i < n; i++)
    {
        printf("%c", ptr[i]); // why instead of c it doesn't accept s,p
    }
    printf("\n\n");
    free(ptr);

    // CALLOC DYNAMIC FUNCTION
    printf("Enter the size of array u wnat for storing characters:\n");
    scanf("%d", &n);
    ptr = (int *)calloc(n, sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the %d element of array:\n", i);
        scanf("%d", &ptr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d", ptr[i]); // why instead of c it doesn't accept s,p
    }
    printf("\n\n");
    //Note-if you are using realloc then you can't use "free dynamic function" because it won't work likewise

    // realloc dynamic function
    printf("Enter the new size of array u want for storing characters:\n");
    scanf("%d", &n);
    ptr = (int *)realloc(ptr, n * sizeof(int));
    for (int i = 0; i < n; i++)
    {
        printf("Enter the %d element of array:\n", i);
        scanf("%d", &ptr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("%d", ptr[i]);
    }
    free(ptr);// after deallocation ptr becomes dangling pointer .
    ptr=NULL;//now ptr is 0 it is not dangling.
    return 0;
}


//note-1.)free function ideally is not needed for local variables beacause lifetime of function is
//        only till program runs
