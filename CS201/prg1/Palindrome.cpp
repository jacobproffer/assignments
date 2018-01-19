// Palindrome.cpp : main project file.

#include "stdafx.h"

#include <fstream>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

// Original boolean function that uses a string constructor,
// which takes two iterators as input (rbegin() and rend()),
// and returns a reversed version of the original string

/*
bool palindromeCheck(string input) {
    if (input == string(input.rbegin(), input.rend())) {
        return true;
    } 
    else {
        return false;
    }
}
*/

bool palindromeCheck(string word) {
	string temp = "";
	int len = word.length();
	for(int i = len - 1; i >= 0; i--) {
		temp += word[i];
	}
	if(temp == word) {
		return true;
	}
	else {
		return false;
	}
}

int main()
{
    //Variable to store a word
    string line;
    //Variable to keep track of word count 
    int numberOfWords = 0;
    //Variable to keep track of palindrome count
    int numberOfPalindromes = 0;
    //variable to keep track of current longest palindrome length
    int currentLength = 1;
    //Variable to keep track of the longest palindrome
    string longestPalindrome;
    //Vector to store palindromes
    vector<string> palindrome(100000);
    //Read a list of words
    ifstream reader("dict.txt");
    //File to write palindromes to
    ofstream writer("palindromes.txt", ios::trunc | ios::binary);
 
    //If there are read errors, alert the user and stop the program
    if(reader.fail()) {
        cout << "Error reading file!";
        return -1;
    //Else, read the file
    } else {
        //Run a for loop that reads through the list of words by each line
        for(int i = 0; ! reader.eof(); i++) {
            getline (reader,line);
            //Each time through the loop, add one to numberOfWords
            numberOfWords++;
            //Convert the current line to lowercase
            for(int i = 0; i < line.length(); i++) {
                line[i] = tolower(line[i]);
            }
            //Print all the palindromes.
            if(palindromeCheck(line)) {
                //If a palindrome is found, add one to numberOfPalindromes
                numberOfPalindromes++;
                //Add found palindrome into vector
                palindrome.push_back(line);
                //Check for longest palindrome
                if(line.length() > longestPalindrome.length()) {
                    longestPalindrome = line;
                }
            }
        }
    }
 
    //While the value of currentLength is less than or equal to the length of the longest Palindrome
    while(currentLength <= longestPalindrome.length()) {
        //Loop through the palindrome vector
        for(int i = 0; i < palindrome.size(); i++) {
            //If current checked palindrome's length is longer than currentLength
            if(palindrome[i].length() == currentLength) {
                //Print the current palindrome
                cout << palindrome[i] << endl;
                //If there are write errors, alert the user and stop the program
                if(writer.fail()) {
                    cout << "Error writing file!";
                    return -1;
                //Else, write the contents of the palindrome vector to document
                } else {
                    writer << palindrome[i] << endl;
                }
            }
        }
        //Increment currentLength by one each time through the while loop
        currentLength++;
    }
 
    //Print the number of palindromes found
    cout << "Out of " << numberOfWords << " words, " << numberOfPalindromes << " palindromes were found." << endl;
    //Print the longest palindrome found
    cout << "The longest palindrome is " << longestPalindrome << "." << endl;
 
    //Close all files
    reader.close();
    writer.close();
 
    return 0;
}
