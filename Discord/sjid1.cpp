#include<iostream>
#include<iomanip>
using namespace std;

const int MaxEmployees=12;
string EmployeList[MaxEmployees]={"2001","2002", "3001", "3002", "4001", "4002",
                                       "5001", "5002", "6001", "7002", "8001", "8002"};


int main(){
    string EmployeId;
    double WorkingHours,Rate;

    cout<<"Employe Id(Max 10 char): "<<endl;
    cin>>EmployeId;

    cout<<"Working hours: "<<endl;
    cin>>WorkingHours;

    cout<<"Salary amount/hr: "<<endl;
    cin>>Rate;


    int index=-1, i;
    for(i=0;i<MaxEmployees;i++){
        if(EmployeList[i] == EmployeId){
            index=i;
            break;
        }
    }
    if(index !=-1){
        double salary=WorkingHours*Rate;
        cout<<fixed<<setprecision(2);
        cout<<"Employe Id: "<<EmployeId<<endl;
        cout<<"Salary: "<<salary<<endl;


    }
    else{cout<<"Employe not found"<<endl;}




return 0;}