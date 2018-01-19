#include <iostream>
using namespace std;

void countDown(int number) 
{
	if (number == 0)
	   return;
	cout << number << "\n";
	return countDown(number - 1);
}

int main () 
{
	countDown(10);
}