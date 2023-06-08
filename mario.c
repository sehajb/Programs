#include <cs50.h>
#include <stdio.h>

int main(void)
{
    int n=0;
    // Prompt for user input and make sure that number is positive and between 1-8
    while (true)
    {
        n = get_int("Enter the size: ");
        if (n > 0 & n <= 8)
        {
            break;
        }
    }
    // variable that holds the value less than the user entered number.

    int swidth = n - 1;
    // first loop will print # from top to bottom
    for (int i = 0; i < n;)
    {
        // second loop will print spaces from left to right for first triangle.
        for (int j = 0; j < swidth; j++)
        {
            printf(" ");
        }
        i++;

        // third loop will print # from left to right for the first triangle.
        for (int k = 0; k < i; k++)
        {
            printf("#");

        }
        swidth--;
        //prints character gap between two triangles.
        printf("  ");
        //loop for the second triangle
        for (int b = 0; b < i; b++)
        {
            printf("#");
        }
        // escape character to jump down the cursor once you done with a line.
        printf("\n");
    }
}


