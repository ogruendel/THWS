package chapter12;

import java.util.Objects;

public class BinaryTree {
    DictionaryNode root;

    public void insert(DictionaryNode node) {
        if (this.root == null) {
            this.root = node;
        } else {
            insert(node, root);
        }
    }

    private void insert(DictionaryNode node, DictionaryNode temp) {
        if (node.getWord().compareTo(temp.getWord()) < 0) {
            // left
            if (temp.getLeft() == null) {
                temp.setLeft(node);
            } else {
                insert(node, temp.getLeft());
            }
        } else {
            // right
            if (temp.getRight() == null) {
                temp.setRight(node);
            } else {
                insert(node, temp.getRight());
            }
        }
    }

    public void print() {
        printTree(this.root);
    }

    private void printTree(DictionaryNode node) {
        if (node.getLeft() != null) {
            printTree(node.getLeft());
        }
        System.out.println(node.getWord());
        if (node.getRight() != null) {
            printTree(node.getRight());
        }
    }

    public String search(String s) {
        DictionaryNode node = this.root;
        while (!Objects.equals(s, node.getWord())) {
            if (node.getWord().compareTo(s) < 0) {
                node = node.getRight();
            } else {
                node = node.getLeft();
            }

            if (node == null) {
                return null;
            }
        }
        return node.getDescription();
    }

    public DictionaryNode searchNode(String s) {
        DictionaryNode node = this.root;
        while (!Objects.equals(s, node.getWord())) {
            if (node.getWord().compareTo(s) < 0) {
                node = node.getRight();
            } else {
                node = node.getLeft();
            }

            if (node == null) {
                return null;
            }
        }
        return node;
    }

    public void delete(DictionaryNode node) {
        DictionaryNode current = this.root;
        DictionaryNode previous = this.root;

        while (node != current) {
            if (node.getWord().compareTo(previous.getWord()) < 0) {
                previous = current;
                current = current.getLeft();
            } else {
                previous = current;
                current = current.getRight();
            }
        }

        if (current == this.root) {
            if (current.getLeft() != null) {
                this.root = current.getLeft();
            } else if (current.getRight() != null) {
                this.root = current.getRight();
            } else {
                this.root = null;
            }
        } else if (current.getLeft() == null && current.getRight() == null) {
            if (previous.getRight() == current) {
                previous.setRight(null);
            } else {
                previous.setLeft(null);
            }
        } else if (current.getLeft() == null) {
            if (previous.getRight() == current) {
                previous.setRight(current.getRight());
            } else {
                previous.setLeft(current.getRight());
            }
        } else if (current.getRight() == null) {
            if (previous.getRight() == current) {
                previous.setRight(current.getLeft());
            } else {
                previous.setLeft(current.getLeft());
            }
        } else {
            if (current.getRight() != null) {
                previous.setLeft(current.getRight());
                if (current.getLeft() != null) {
                    current.getRight().setLeft(current.getLeft());
                }
            } else if (current.getRight() == null) {
                if (current.getLeft() != null) {
                    previous.setLeft(current.getLeft());
                }
            } else if (current.getLeft() != null) {
                if (current.getRight() != null) {
                    previous.setLeft(current.getRight());
                }
            }
        }
    }

}
