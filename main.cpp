#include <iostream>

using namespace std;
double a,b;
char znak;

int main()
{
    cout<<"Kalkulator"<<endl;
    cout<<""<<endl;
    cout<<"Podaj liczbe"<<endl;
    cin>>a;
    cout<<"Podaj druga liczbe"<<endl;
    cin>>b;
    cout<<"Dodawanie => + "<<endl;
    cout<<"Odejmowanie => - "<<endl;
    cout<<"Mno¿enie => * " <<endl;
    cout<<"Dzielenie => /"<<endl;

    cin>>znak;
    switch(znak)
    {
    case '+':
        {
            double dod = a+b;
            cout<<"Wynik jest rowny "<<dod<<endl;
            break;
        }
    case'-':
        {
            double ode = a-b;
            cout<<"Wynik jest rowny "<<ode<<endl;
            break;
        }
    case'*':
        {
            double mno = a*b;
            cout<<"Wynik jest rowny "<<mno<<endl;
            break;
        }
    case'/':
        {
            double dzi = a/b;
            cout<<"Wynik jest rowny " <<dzi<<endl;
            break;
        }
    default:
        cout<<"Nie ma takiej opcji";
    }
   return 0;
}
