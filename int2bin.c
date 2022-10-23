#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(){

    long n, i=0, bin=0;

    scanf("%d", &n);

    while(n != 0){
        if(n%2 != 0)
            bin += pow(10,i);

        i++;
        n/=2;
    }

    printf("%d\n", bin);
}