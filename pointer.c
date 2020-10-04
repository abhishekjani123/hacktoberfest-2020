#include<stdio.h>
#include<conio.h>
main()
{
//int x=10;
//float y=20.20;
int a[2]={10,20};
float b[2]={20.20,45.60};
//int *p=&x;
//float *q=&y;
int *p=&a[0];
float *q=&b[0];
clrscr();
printf("%d\t%d\t%f\t%f\t%u\t%u\t%u\t%u",a[0],a[1],b[0],b[1],p,p+1,q,q+1); //addresses and values as p=&a[0], p+1=&a[1]
printf("\n%d\t%d",sizeof(p), sizeof(q));//tthis program is scale factor.
getch();
return 0;
}
