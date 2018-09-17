/**
 * BinarySearchTree
 * Implements a map, using a 
 * binary search tree 
 */
public class BinaryTreeMap<Key extends Comparable, Value> {
    private class Node<Key extends Comparable, Value> {
        Key key; 
        Value value; 
        Node<Key, Value> left; 
        Node<Key, Value> right;
    }   
    
    Node<Key, Value> root; 

    public void put(Key key, Value value) {
        Node<Key, Value> node = new Node(); 
        node.key = key; 
        node.value = value; 

        if(root == null) {
            root = node; 
            return; 
        }
        
        add(node, root); 
    }

    private void add(Node<Key, Value> node, Node<Key, Value> current) {
        if (current.equals(node)) {
            current = node; 
            return; 
        }

        if (node.key.compareTo(current.key) < 0) {
            add(node, current.left); 
        } else {
            add(node, current.right); 
        }
    }

    /**
     * Get the value 
     * associated with the 
     * provided key
     * @param key of the element
     * @return the value ifp resent, null if not
     */
    public Value get(Key key) {
        return get(key, root); 
    }

    private Value get(Key key, Node<Key, Value> current) {
        if (current == null) 
            return null; 
        if (current.key.equals(key)) 
            return current.value; 

        if(current.key.compareTo(key) < 0) {
            return get(key, current.left); 
        } else {
            return get(key, current.right); 
        }
    }
}