class Solution {
    // Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root) {
        // Collecting the in-order traversal of the binary tree
        ArrayList<Integer> list = inorder(root);
        Node cur = new Node(list.get(0)); // Create the head of the DLL
        Node prev = cur; // Keep track of the previous node

        // Iterate through the collected values to create the DLL
        for (int i = 1; i < list.size(); i++) {
            Node newNode = new Node(list.get(i)); // Create a new node for the DLL
            prev.right = newNode; // Link the previous node's right to the new node
            newNode.left = prev; // Link the new node's left to the previous node
            prev = newNode; // Move the previous pointer to the new node
        }

        return cur; // Return the head of the doubly linked list
    }

    // Helper function to perform in-order traversal
    ArrayList<Integer> inorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list; // Base case for recursion

        // Traverse the left subtree, visit the root, and then the right subtree
        list.addAll(inorder(root.left));
        list.add(root.data);
        list.addAll(inorder(root.right));

        return list; // Return the collected values
    }
}
