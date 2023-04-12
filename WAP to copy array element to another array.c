
//WAP to count positive and negative element of array
#include<stdio.h>
#include<conio.h>
int main()
{
    int a[10],b[10],i,n;

    printf("enter the number of element of array= ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("enter the number=");
        scanf("%d",&a[i]);
    }
    printf("copied array");
    for(i=0;i<n;i++)
    {
       printf("\ncopied array=%d",a[i]);

    }



    return 0;
}

