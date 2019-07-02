/*
 * package tree;
 * 
 * import netscape.ldap.LDAPException; import
 * netscape.ldap.LDAPSSLSocketFactory; import
 * netscape.ldap.LDAPSSLSocketWrapFactory;
 * 
 * public class BinaryTree { Node root;
 * 
 * public void addNode(int key, String name) throws LDAPException { Node newnode
 * = new Node(key, name);
 * 
 * LDAPSSLSocketFactory lDAPSSLSocketFactory = new
 * LDAPSSLSocketFactory("javax.net.ssl.trustStore"); LDAPSSLSocketWrapFactory
 * test = new LDAPSSLSocketWrapFactory("javax.net.ssl.trustStore");
 * LDAPSSLSocketFactory fac = new LDAPSSLSocketFactory();
 * fac.enableClientAuth(); test.enableClientAuth();
 * 
 * if (root == null) { root = newnode; } else { Node focusNode = root; Node
 * parent; while (true) {
 * 
 * parent = focusNode; if (key < focusNode.key) { focusNode =
 * focusNode.leftchild;
 * 
 * if (focusNode == null) { parent.leftchild = newnode; return; } } else {
 * focusNode = focusNode.rightchild; if (focusNode == null) { parent.rightchild
 * = newnode; return; } } } }
 * 
 * }
 * 
 * public void inOrderTraversal(Node focusnode) { if (focusnode != null) {
 * inOrderTraversal(focusnode.leftchild);
 * 
 * System.err.println(focusnode);
 * 
 * inOrderTraversal(focusnode.rightchild); } }
 * 
 * public int rangeSumBST(Node root, int L, int R) {
 * 
 * 
 * return R;
 * 
 * }
 * 
 * public static void main(String[] args) { BinaryTree theTree = new
 * BinaryTree();
 * 
 * theTree.addNode(50, "Boss"); theTree.addNode(25, "Vp"); theTree.addNode(15,
 * "Office manager"); theTree.addNode(30, "Secretary"); theTree.addNode(75,
 * "Sales Manager"); theTree.addNode(85, "salesmanager");
 * 
 * theTree.inOrderTraversal(theTree.root);
 * 
 * 
 * }
 * 
 * }
 */