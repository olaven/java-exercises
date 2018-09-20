/**
 * BinaryTreeMap
 */
public class BinaryTreeMap<Key extends Comparable, Value> {

    private class Node<Key extends Comparable, Value> {
        Node<Key, Value> left;
        Node<Key, Value> right;

        Key key;
        Value value;
    }

    private Node<Key, Value> root;

    /**
     * Add a key-value pair to the map 
     * @param key key to reference later 
     * @param value value to store 
     */
    public void put(Key key, Value value) {

        Node<Key, Value> node = new Node(); 
        node.key = key; 
        node.value = value; 

        if (root == null) {
            root = node; 
            return ;
        }

        put(node, root); 
    }

    private void put(Node<Key, Value> node, Node<Key, Value> current) {

        if(node.key.compareTo(current.key) < 0) {
            if (current.left == null) {
                current.left = node; 
                return; 
            } else {
                put(node, current.left); 
            }
        }
        else {
            if (current.right == null) {
                current.right = node;
                return; 
            } else {
                put(node, current.right); 
            }
        }
    }

    /**
     * Retrieve a value from the map
     * @param key value`s associated key
     */ 
    public Value get(Key key) {
        return get(key, root); 
    }

    private Value get(Key key, Node<Key, Value> current) {
        if (current == null) // can not be in tree.
            return null; 
        if (key.compareTo(current.key) == 0) // found the right one!
            return current.value; 

        // call get recursively on next node 
        if (key.compareTo(current.key) < 0) 
            return get(key, current.left); 
        else 
            return get(key, current.right);
    }



}