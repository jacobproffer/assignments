#include <iostream>
#include <list>
#include <vector>

using namespace std;

int main() {

	// declare a vector of integers with no initial size
	cout << "" << endl;
	vector<int> data;
	cout << "0. size: " << data.size() << endl;
	// use a for loop to insert data
	for(int i = 0; i < 10; i++) 
		data.push_back(i);
	cout << "1. size: " << data.size() << endl;
	cout << "" << endl;

	// accessing elements
	for(int j = 0; j < data.size(); j++) 
		cout << data.at(j) << endl;
	//  cout << data[j] << endl;
	cout << "" << endl;
	
	// accessing vector values with normal iterators
	cout << "Values in order:" << endl;
	for(vector<int>::iterator it = data.begin(); it != data.end(); it++) {
		cout << *it << endl;
	}
	cout << "" << endl;

	// accessing vector values with reverse iterators
	cout << "Values backwards:" << endl;
	for(vector<int>::reverse_iterator it = data.rbegin(); it != data.rend(); it++) {
		cout << *it << endl;
	}

	// declare a vector of strings with no initial size
	cout << "" << endl;
	vector<string> names;
	names.push_back("Jacob");
	names.push_back("Justine");
	names.push_back("Robert");

	// accessing vector values of type string with normal iterators
	cout << "Names: " << endl;
	for(vector<string>::iterator it = names.begin(); it != names.end(); it++) {
		cout << *it << endl;
	}
	cout << "" << endl;

	// accessing vector values of type string with reverse iterators
	cout << "Names vector reversed: " << endl;
	for(vector<string>::reverse_iterator it = names.rbegin(); it != names.rend(); it++) {
		cout << *it << endl;
	}
	cout << "" << endl;

	// declare a list of strings with no initial size
	list<string> last_names;
	last_names.push_back("Proffer");
	last_names.push_back("Olson");
	last_names.push_back("Adams");

	// accessing list values of type string with normal iterators
	cout << "Last names: " << endl;
	for(list<string>::iterator it = last_names.begin(); it != last_names.end(); it++) {
		cout << *it << endl;
	}
	cout << "" << endl;

	// accessing list values of type string with reverse iterators
	cout << "Last names reversed: " << endl;
	for(list<string>::reverse_iterator it = last_names.rbegin(); it != last_names.rend(); it++) {
		cout << *it << endl;
	}
	cout << "" << endl;

	return 0;

}