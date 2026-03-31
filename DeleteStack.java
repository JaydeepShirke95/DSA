function deleteMiddle(stack) {
    const elements = [];

    // Transfer elements from stack to vector
    while (stack.length > 0) {
        elements.push(stack.pop());
    }

    // Remove the middle element
    const midIndex = Math.floor(elements.length / 2);
    elements.splice(midIndex, 1);

    // Push elements back into the stack in correct order
    for (let i = elements.length - 1; i >= 0; i--) {
        stack.push(elements[i]);
    }
}

// Driver code
const stack = [];
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);
stack.push(50);

deleteMiddle(stack);

while (stack.length > 0) {
    console.log(stack.pop() + " ");
}
