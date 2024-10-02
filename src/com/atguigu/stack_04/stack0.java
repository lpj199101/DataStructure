package com.atguigu.stack_04;





public class stack0 {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        System.out.println(num.length);

        stack sta = new stack(5);

        sta.isFull();


    }

}


class stack{

    public int[] stack;
    public int maxSize;
    public int top = -1;

    public stack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //�ж�ջ��
    public boolean isFull(){
        return top == maxSize - 1;
    }
    //�ж�ջ��
    public boolean isEmpty(){
        return top == -1;
    }
    //��ջ
    public void push(int val){
        if(isFull()){
            System.out.println("ջ��");
            return;
        }
        top++;
        stack[top] = val;
    }
    //��ջ
    public int pop(){
        if(isEmpty()){
            System.out.println("ջ��");
            return 0;
        }
        int value = stack[top];
        top--;
        return value;
    }




}

