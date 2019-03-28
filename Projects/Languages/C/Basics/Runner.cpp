#include <iostream>


struct student {
    char name[50];
    int roll;
    float marks;
} s[10];

int main() {
    cout << "Enter information of students: " << endl;

    // storing information
    for (int i = 0; i < 10; ++i) {
        s[i].roll = i + 1;
        cout << "For roll number" << s[i].roll << "," << endl;

        cout << "Enter name: ";
        cin >> s[i].name;

        cout << "Enter marks: ";
        cin >> s[i].marks;

        cout << endl;
    }

    cout << "Displaying Information: " << endl;

    // Displaying information
    for (int i = 0; i < 10; ++i) {
        cout << "\nRoll number: " << i + 1 << endl;
        cout << "Name: " << s[i].name << endl;
        cout << "Marks: " << s[i].marks << endl;
    }

    return 0;
}

void cyclicSwap(int *a, int *b, int *c) {
    int temp;
    temp = *b;
    *b = *a;
    *a = *c;
    *c = temp;

    int a[10][10], trans[10][10], r, c, i, j;

    cout << "Enter rows and columns of matrix: ";
    cin >> r >> c;

    // Storing element of matrix entered by user in array a[][].
    cout << endl << "Enter elements of matrix: " << endl;
    for (i = 0; i < r; ++i)
        for (j = 0; j < c; ++j) {
            cout << "Enter elements a" << i + 1 << j + 1 << ": ";
            cin >> a[i][j];
        }


}


