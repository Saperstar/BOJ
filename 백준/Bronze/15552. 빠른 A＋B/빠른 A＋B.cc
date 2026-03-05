/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>

int main(){
    int t,a,b;
    scanf("%d",&t);
    for(int i=0; i<t; i++){
        scanf("%d %d",&a,&b);
        printf("%d\n",a+b);
    }
    
    return 0;
}