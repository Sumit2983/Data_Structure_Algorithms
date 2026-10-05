#include<bits/stdc++.h>
#include<queue>

using namespace std;
// implementing queue using array
// Queue data sturcture:
// enqueue(10) => [10]

// Queue using array
// basic logic if rear == size-1 then queue is full
// if front == -1 or front >rear then queue is empty

class Queue{
    public:
    int arr[100];
    int front;
    int rear;
    int size;
    Queue(int size){
        this->size = size;
        arr[size];
        front = -1;
        rear = -1;
    }
    void enqueue(int data){
        if(rear == size-1){
            cout<<"Queue is full"<<endl;
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = data;
    }
    void dequeue(){
        if()
    }

};
int main(){

    return 0;
}