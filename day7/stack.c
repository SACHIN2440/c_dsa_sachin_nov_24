#include <stdio.h>
#include <stdlib.h>

#define MAX 5  // Stack size

// Stack structure
struct Stack {
    int arr[MAX];
    int top;
};

// Initialize stack
void initStack(struct Stack* s) {
    s->top = -1;
}

// Push operation
void push(struct Stack* s, int value) {
    if (s->top == MAX - 1) {
        printf("Stack Overflow!\n");
    } else {
        s->arr[++(s->top)] = value;
    }
}

// Pop operation
int pop(struct Stack* s) {
    if (s->top == -1) {
        printf("Stack Underflow!\n");
        return -1;
    }
    return s->arr[(s->top)--];
}

// Peek operation
int peek(struct Stack* s) {
    if (s->top == -1) {
        printf("Stack is empty!\n");
        return -1;
    }
    return s->arr[s->top];
}

int main() {
    struct Stack s;
    initStack(&s);

    push(&s, 10);
    push(&s, 20);
    push(&s, 30);

    printf("Top element: %d\n", peek(&s));
    printf("Popped: %d\n", pop(&s));
    printf("Top element after pop: %d\n", peek(&s));

    return 0;
}
