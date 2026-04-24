#include <stdio.h>
#define MAX_SIZE 100
// 1. Traverse: Print every array element one by one
void traverse(int arr[], int size) {
    printf("Array elements: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
// 2. Insertion: Adding an element at a specific index
// Returns the new size of the array
int insert(int arr[], int size, int element, int index) {
    if (size >= MAX_SIZE) {
        printf("Error: Array Overflow\n");
        return size;
    }
    if (index < 0 || index > size) {
        printf("Error: Invalid Index\n");
        return size;
    }

    // Shift elements to the right to make space
    for (int i = size; i > index; i--) {
        arr[i] = arr[i - 1];
    }

    arr[index] = element;
    return size + 1; // Return updated size
}

// 3. Deletion: Removing an element at a given index
// Returns the new size of the array
int deleteElement(int arr[], int size, int index) {
    if (index < 0 || index >= size) {
        printf("Error: Invalid Index\n");
        return size;
    }

    // Shift elements to the left to fill the gap
    for (int i = index; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }

    return size - 1; // Return updated size
}
// 4. Search: Locating an element by value (Linear Search)
// Returns the index if found, or -1 if not found
int search(int arr[], int size, int value) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == value) {
            return i; // Found!
        }
    }
    return -1; // Not found
}

// 5. Update: Modifying an existing element at a specific index
void update(int arr[], int size, int index, int newValue) {
    if (index >= 0 && index < size) {
        arr[index] = newValue;
    } else {
        printf("Error: Index out of bounds\n");
    }
}

int main() {
    int arr[MAX_SIZE] = {10, 20, 30, 40, 50};
    int size = 5;

    // Example Usage:
    traverse(arr, size);

    size = insert(arr, size, 25, 2); // Insert 25 at index 2
    traverse(arr, size);

    size = deleteElement(arr, size, 4); // Delete element at index 4
    traverse(arr, size);

    int foundIndex = search(arr, size, 30);
    printf("Element 30 found at index: %d\n", foundIndex);

    update(arr, size, 0, 100); // Change index 0 to 100
    traverse(arr, size);

    return 0;
}
