#include <iostream>

using namespace std;

int main() {
	for(int line = 1; line < 7; line++) {
		for(int space = 1; space < 7-line; space++) {
			cout << " ";
		}
		for(int star = 1; star <= 2 * line - 1; star++) {
			cout << "*";
		}
		cout << endl;
	}
}