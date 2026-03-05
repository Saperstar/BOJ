#include <stdio.h>

int main()
{
    int a,b,c;
    int hour,min,minsum;
    scanf("%d %d",&a,&b);
    scanf("%d",&c);
    minsum = b + c;
    hour = a + minsum / 60;
    min = minsum % 60;
    if(hour >= 24){
        hour = hour % 24;
    }
    printf("%d %d",hour,min);
    

    return 0;
}