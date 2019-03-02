/* multi-line comment*/

// single lien comment

// imports functions such as printf() and scanf()
#include <stdio.h>
#include <string.h>

// constant
#define MYNAME "Sebastian"

// global variable acessible to everysingle function in the program
int globalVar = 100;

int main()
{
  // can use sizeOf() function to determine size of data type

  // 1 byte (-128-127 or 0-255)
  char firstLetter = 'S';

  // 4 bytes (-2,147,483,648-2,147,483,647 or  0-4,294,967,295) could be 2 bytes
  int age = 17;

  // 2 bytes (-32,768-32,767 or 0-65,535)
  short altitude = 30000;

  // 4 bytes (-2,147,483,648-2,147,483,647 or 0 to 4,294,967,295) there are also "long long"
  long int superBigNum = 243434900;

  // 4 bytes (1.2E-38 to 3.4E+38) single-point precision: 6 decimal places
  float piValue = 3.14159;

  // 8 bytes (2.3E-308 to 1.7E+308) double-point precision: 15 decimal places
  double longerPi = 3.14159265359;

  // 10 bytes (3.4E-4932 to 1.1E+4932) 19 decimal places
  long double crazyNum = 39287432488234024.398247328947293;

  /*--------------------------------------------------------------------------------------*/

  // printing to terminal (escaped characters: \n = new line; \t = tab; \\ = \; \" = ")
  printf("Hello, World!\n\n");

  printf("I am %d years old\n\n", age);

  printf("Big number %ld\n\n", superBigNum);

  printf("Pi = %.5f\n\n", piValue);

  printf("Long Pi = %.11f\n\n", longerPi);

  printf("The first letter in my name is %c\n\n", firstLetter);

  printf("My first name is %s\n\n", "Sebastian");

  // creating strings(DON'T FORGET THE STRING TERMINATOR: \0 allocate one extra space)
  char myFirstName[9] = "Sebastian";

  char myLastName[] = "Nunez";

  printf("My last name is %s\n\n", myLastName);

  // from the string.h function you can use "strcpy()" to mutate a string
  // be CAREFUL make sure the copied string is not larger than the original
  strcpy(myLastName, "Torre");

  printf("My new last name is %s\n\n", myLastName);

  return 0;
}
