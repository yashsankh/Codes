#include <stdio.h>


int main(){
   
    float first ;
    float second;
    char input;
    printf("Select the option for conversion\n");
    printf("  1.) Km to Meter \n  2.) Meter to Km \n  3.) Miles to Km \n  4.) Km to Miles \n  5.) Meter to Cm \n  6.) Cm to Meter \n  7.)To quit program press q \n");
    
    while (1)
    {   
       
        
        printf("Enter the input character for conversion:\n");
        scanf(" %c ", &input);
        printf("Enter the quantity for conversion:\n");
        scanf(" %f ", &first);
        
        switch (input){
            case '1':
            second=first*1000;
            printf("%f km is equal to %f meter \n",first,second);
                break;


            case '2':
                second=first/1000;
                printf("%f meter is equal to %f km \n",first,second);
                break;

                
            case '3':
                second=first*1.60934;
                printf("%f mile is equal to %f km \n",first,second);
                break;


            case '4':
                second=first/1.60934;
                printf("%f km is equal to %f mile \n",first,second);
                break;


            case '5':
                second=first*100;
                printf("%f meter is equal to %f cm \n",first,second);
                break;


            case '6':
                second=first/100;
                printf("%f cm is equal to %f meter \n",first,second);
                break;
            /*case 'q':
                printf("Quitting the program.....\n");
                goto end;
                break;*/
            if(input=='q')
            {
                     printf("Quitting the program.....\n");
                     break;
                }
            
            default:
                printf("Enter appropriate option......\n");
                break;
        }
    }
    return 0;
}