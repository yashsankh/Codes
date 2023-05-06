#include <stdio.h>//in this code we can understand heap and stack......
   
int n;

void reverse(int *arr[]);//(int arr[])look we are using pointer and storing data dynamicly 
    
int main()
{   
    printf("Enter the total elements for array :\n");
    scanf("%d",&n);
    int arr[n];
    for (int i = 0; i < n; i++)
    {   
        
        printf("Enter the %d element for array :\n",i);
        scanf("%d",&arr[i]);
        
    }
        printf("\n");
    reverse(arr);
    return 0;
}

void reverse(int *arr[])//(int *arr[])
{
    
    //printf("How many elements are there in your array ?\n");
    //scanf("%d", &n);
    for(int i=0;i<n/2;i++){
         
    int x=arr[i];
    arr[i]=arr[(n-1)-i];
    arr[(n-1)-i]=x;
    
    }
   for(int i=0;i<n;i++){
     
      printf("%d\n",arr[i]);   
    }
    
    
}
