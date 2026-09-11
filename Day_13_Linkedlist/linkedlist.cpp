// Online C++ compiler to run C++ program online
#include <iostream>
#include<vector>
// #include<any>//for above 
#define null nullptr
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    Node(int data){
        this->data = data;
        this->next = null;
    }
};
void printlist(Node* head){
    Node* temp = head;
    while(temp != null){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
};
int search_in_linkedlist(Node* head,int target){
    Node* temp = head;
    int count = 0;
    while(temp != null){
        count++;
    if(temp->data == target){
        return count;
    }
    temp = temp->next;
    }
    return -1;

}

int main() {
    // Write C++ code here
    Node* head = new Node(9);
    head->next = new Node(4);
    head->next->next = new Node(5);
    printlist(head);
    cout<<endl;
    cout<<search_in_linkedlist(head,5);
    
    

    
    return 0;
}


#include<iostream>
#include<vector>
// #include<any>//
using namespace std;
    // vector<object> arr; can strore any type of data in it

int main(){


    return 0;
}
