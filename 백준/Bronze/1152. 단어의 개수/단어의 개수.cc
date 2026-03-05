#include <iostream>
#include <algorithm>
#include<string>
using namespace std;

int main() {

	string line;
	getline(cin,line);
	int count = 0;
	if (line[0] != ' ') count = 1;
	for (int i = 0; i < line.length() - 1; i++) {
		if (line[i] == ' ' && line[i + 1] != ' ') count++;
	}

	cout << count;

	return 0;
}