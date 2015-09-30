/*
Autor: Luciene Cavalcanti
Programa exemplo em C++
*/
#include <iostream>
using namespace std;

void main(){
    int n=0;
// em C
    printf("Digite um número:");
    scanf(%d, &n);
    printf("O número digitado foi:%d", n);

// ou em C++
    cout << "Digite um número:";
    cin >> n;
    cout << "O número digitado foi:" << n;

}
